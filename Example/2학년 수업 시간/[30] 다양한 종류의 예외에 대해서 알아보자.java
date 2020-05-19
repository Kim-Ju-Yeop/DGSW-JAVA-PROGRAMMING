package class05_19;

import class04_29.Animal;
import class04_29.Cat;
import class04_29.Dog;

import java.io.*;
import java.nio.file.FileSystem;
import java.util.ArrayList;
import java.util.List;

public class ExceptionStudy {

    public void exception1(){
        String str = null;
        System.out.println(str.length());
    }

    public void exception2(){
        int a = 5;
        int b = 0;
        int c = a / b;
    }

    public void exception3(){
        int[] array = new int[3];

        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);

        System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
    }

    public void exception4(){
        Animal dog = new Dog();
        Animal cat = new Cat();

        Dog dog2 = (Dog) dog;
        Cat cat2 = (Cat) dog;
    }

    public void exception5(){
        String str = "12G";
        int value = Integer.parseInt(str);

        System.out.println(value + 3);
    }

    public void exception6() throws IOException{
        File file = new File("/Users/jueyop/Desktop/study");

        InputStream is = new FileInputStream(file);
        is.close();
    }

    public static void main(String[] args) {
        try{
            ExceptionStudy study = new ExceptionStudy();
            study.exception6();
        }
        catch (FileNotFoundException e){
            System.out.println("파일을 찾을 수 없습니다.");
        }
        catch (IOException e){
            System.out.println("입출력 오류가 존재합니다.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {

        }
    }
}
