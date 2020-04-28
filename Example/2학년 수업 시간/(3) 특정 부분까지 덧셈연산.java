package class04_21;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        add();
    }

    public static void add(){
        int sum = 0;

        int start = input();
        int end = input();

        while(start <= end){
            sum += start;
            start++;
        } System.out.println(String.format("Sum : %d", sum));
    }

    public static int input(){
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        return value;
    }
}
