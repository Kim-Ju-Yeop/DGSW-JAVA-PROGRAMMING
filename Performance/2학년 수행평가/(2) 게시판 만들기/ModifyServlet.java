package example.class07_02;

import example.class06_18.SimpleDbBulletin;
import example.class06_24.BulletinModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ModifyServlet", urlPatterns = "/modify")
public class ModifyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            int sequence = Integer.parseInt(request.getParameter("sequence"));
            String title = request.getParameter("title");
            String content = request.getParameter("content");
            String writer = "글쓴이";

            BulletinModel model = new BulletinModel(sequence, title, content, writer);

            SimpleDbBulletin bulletin = new SimpleDbBulletin();
            bulletin.updateList(model);

            response.setCharacterEncoding("UTF-8");
            response.getWriter().print("정상적으로 수정되었습니다.");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
