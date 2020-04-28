package class04_22;

import java.util.Scanner;

public class Exchange {

    private float dollar;
    private float won;

    public static void main(String[] args) {
        Exchange exchange = new Exchange();
        exchange.input();
        exchange.exchange();
        exchange.show();
    }

    private void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("달러를 입력해주세요 : ");
        dollar = scanner.nextFloat();
    }

    private void exchange(){
        won = (float) (dollar * 1232.20);
    }

    private void show(){
        System.out.println(dollar + " 달러는 원화로 환전 시 " + won + "원 입니다. (참고 : 1달러 기준 1232.2원)");
    }
}
