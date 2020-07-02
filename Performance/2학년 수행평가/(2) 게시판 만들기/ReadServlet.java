package example.class07_02;

import com.google.gson.Gson;
import example.class06_18.SimpleDbBulletin;
import example.class06_24.BulletinModel;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ReadServlet", urlPatterns = "/readServlet")
public class ReadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            int sequence = Integer.parseInt(request.getParameter("sequence"));

            SimpleDbBulletin simpleDbBulletin = new SimpleDbBulletin();
            BulletinModel model = simpleDbBulletin.getList(sequence);

            Gson gson = new Gson();
            String jsonString = gson.toJson(model);

            response.setContentType("application/json; charset=UTF-8");
            response.getWriter().print(jsonString);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
