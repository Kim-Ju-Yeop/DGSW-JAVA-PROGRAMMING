package class06_09.ex1;

import java.util.Scanner;

public abstract class Calculator {

    public abstract void calculate(int value1, int value2);
    public void execute(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("두 수를 입력하세요.");

            int value1 = scanner.nextInt();
            int value2 = scanner.nextInt();

            if(value1 == 0 && value2 == 0) break;

            calculate(value1, value2);
        }
        scanner.close();
        System.out.println("프로그램을 종료합니다.");
    }
}

class MinusCalculator extends Calculator{

    public static void main(String[] args) {
        MinusCalculator minusCalc = new MinusCalculator();
        minusCalc.execute();
    }

    @Override
    public void calculate(int value1, int value2){
        int result = value1 - value2;
        System.out.println(String.format("%d - %d = %d", value1, value2, result));
    }
}

class PlusCalculator extends Calculator{

    public static void main(String[] args) {
        PlusCalculator plusCalc = new PlusCalculator();
        plusCalc.execute();
    }

    @Override
    public void calculate(int value1, int value2){
        int result = value1 + value2;
        System.out.println(String.format("%d + %d = %d", value1, value2, result));
    }
}

