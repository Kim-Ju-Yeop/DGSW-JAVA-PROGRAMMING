package class05_13.ex2;

import java.util.Scanner;

public class Student implements Runnable{

    private Teacher teacher;
    private String name;

    public Student(Teacher teacher, String name){
        this.teacher = teacher;
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println(name + "학생 스레드가 실행됩니다.");

        while(true){

            System.out.println(name + "학생 스레드가 Teacher 스레드의 문제를 기다리고있습니다.");
            synchronized (teacher){
                try { teacher.wait(); }
                catch (InterruptedException e) { e.printStackTrace(); }
            }

            int value = teacher.getValue();
            if(value <= 0) break;
            System.out.println(name + "학생 스레드가 문제를 받았습니다.");

            long answer = calculateFactorial(value);
            System.out.println(String.format("%s : %d! = %d", name, value, answer));
        }
        System.out.println(name + " 학생 스레드가 종료됩니다.");
    }

    private long calculateFactorial(int value){
        long result = 1;

        for(int i = value; i > 1; i--){
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        new Thread(teacher).start();

        Student student = new Student(teacher, "이원제");
        new Thread(student).start();

        Student student2 = new Student(teacher, "조민서");
        new Thread(student2).start();

        Student student3 = new Student(teacher, "김진호");
        new Thread(student3).start();
    }
}

class Teacher implements Runnable {

    private int value;

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("숫자를 입력해주세요 : ");
            value = scanner.nextInt();

            synchronized (this){
                this.notifyAll();
            }

            if(value <= 0) break;
        } scanner.close();

        System.out.println("선생님 스레드를 종료합니다.");
    }

    public int getValue() {
        return value;
    }
}