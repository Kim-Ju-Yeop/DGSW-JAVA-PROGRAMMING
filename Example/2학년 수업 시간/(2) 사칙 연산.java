package class04_21;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calc(scanner.nextInt(), scanner.nextInt());
    }

    public static void calc(int a, int b){
        System.out.println("더하기 : " + (a + b));
        System.out.println("빼기 : " + (a - b));
        System.out.println("곱하기 : " + (a * b));
        System.out.println("나누기 : " + (a / b));
    }
}
