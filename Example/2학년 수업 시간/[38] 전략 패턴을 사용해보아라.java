package class06_09.ex2;

import java.util.Scanner;

public class Calculate2 {

    public void execute(CalculatorStrategy strategy){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("두 수를 입력하세요.");

            int value1 = scanner.nextInt();
            int value2 = scanner.nextInt();

            if(value1 == 0 && value2 == 0) break;

            strategy.calculate(value1, value2);
        }
        scanner.close();
        System.out.println("프로그램을 종료합니다.");
    }
}

class MinusStrategy implements CalculatorStrategy {

    @Override
    public void calculate(int value1, int value2) {
        int result = value1 - value2;
        System.out.println(String.format("%d - %d = %d", value1, value2, result));
    }

    public static void main(String[] args) {
        Calculate2 calculate2 = new Calculate2();

        CalculatorStrategy strategy = new MinusStrategy();
        calculate2.execute(strategy);
    }
}

class PlusStrategy implements CalculatorStrategy {

    @Override
    public void calculate(int value1, int value2) {
        int result = value1 + value2;
        System.out.println(String.format("%d + %d = %d", value1, value2, result));
    }

    public static void main(String[] args) {
        Calculate2 calculate2 = new Calculate2();

        CalculatorStrategy strategy = new PlusStrategy();
        calculate2.execute(strategy);
    }
}

