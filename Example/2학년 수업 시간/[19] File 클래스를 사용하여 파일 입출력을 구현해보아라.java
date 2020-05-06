package class05_06.seven;

import java.io.*;

public class FileStudy {
    public static void main(String[] args) {

        try{
            File directory = new File("/Users/jueyop/java_study");
            if(!directory.exists()) directory.mkdir(); // 새로운 디렉토리를 생성한다.

            File file = new File(directory, "hello.txt");
            if(!file.exists()) file.createNewFile(); // 새로운 파일을 생성한다.

            // 파일에 데이터를 작성할 때 이용된다.
            OutputStream os = new FileOutputStream(file);
            os.write("Hello World!".getBytes());
            os.close();

            // 파일의 데이터를 불러올 떄 사용합니다.
            InputStream is = new FileInputStream(file);
            byte[] buffer = new byte[1024];
            int length = is.read(buffer);
            is.close();

            String txt = new String(buffer, 0, length);
            System.out.println("READ : " + txt);
            System.out.println("파일의 크기 : " + file.length());
            System.out.println("파일의 이름 : " + file.getName());
            System.out.println("파일의 경로 : " + file.getPath());
            System.out.println("파일의 디렉토리 : " + file.getParent());


            String[] list = directory.list();
            File[] fList = directory.listFiles();

            System.out.println("list : ");
            for(String name : list) System.out.println(" " + name);

            System.out.println();

            System.out.println("fList : ");
            for(File item : fList) System.out.println(" " + item.getAbsolutePath());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
