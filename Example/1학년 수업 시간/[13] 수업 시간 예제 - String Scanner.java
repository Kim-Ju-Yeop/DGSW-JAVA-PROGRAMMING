package Example;

import java.util.Scanner;

public class ScanningString {
    public static void main(String[] args) {
        String source = "1 3 5";

        // Scanner 클래스는 3가지 형태의 생성자가 존재합니다.
        // 1. File
        // 2. String
        // 3. InputStream
        Scanner scanner = new Scanner(source);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int sum = num1+num2+num3;
        System.out.printf("%d + %d + %d = %d", num1, num2, num3, sum);
    }
}
