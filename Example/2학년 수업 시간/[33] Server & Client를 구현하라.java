package class05_20.ex2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerStudy {

    public void start(int port) throws Exception {
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = null;
        OutputStream os = null;

        boolean flag = true;

        while (flag) {
            socket = serverSocket.accept();
            os = socket.getOutputStream();

            Date now = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            byte[] bytes = format.format(now).getBytes();
            os.write(bytes);
        }

        os.close();
        socket.close();
        serverSocket.close();
    }

    public static void main(String[] args) throws Exception{
        ServerStudy serverStudy = new ServerStudy();
        serverStudy.start(1201);
    }
}

class ClientStudy {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 1201);
            InputStream is = socket.getInputStream();

            byte[] buffer = new byte[1024];
            int length = is.read(buffer);
            String message = new String(buffer, 0, length);

            System.out.println("전달받은 메세지 : " + message);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

