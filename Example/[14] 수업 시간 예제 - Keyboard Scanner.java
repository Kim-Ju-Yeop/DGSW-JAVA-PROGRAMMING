package Example;

import java.util.Scanner;

public class ScanningKeyboard {
    public static void main(String[] args) {
        System.out.println("숫자 3개를 입력해주세요 : ");
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int sum = num1+num2+num3;

        System.out.printf("%d + %d + %d = %d", num1, num2, num3, sum);
    }
}
