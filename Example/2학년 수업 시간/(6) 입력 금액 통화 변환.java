package class04_22;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력해주세요 : "); int money = scanner.nextInt();

        SplitCurrency(money);
    }

    public static void SplitCurrency(int money){
        int[] currency = new int[8];

        while(money != 0){
            if(money >= 50000){
                currency[7] += money / 50000;
                money %= 50000;
            } else if(money >= 10000){
                currency[6] += money / 10000;
                money %= 10000;
            } else if(money >= 5000){
                currency[5] += money / 5000;
                money %= 5000;
            } else if(money >= 1000){
                currency[4] += money / 1000;
                money %= 1000;
            } else if(money >= 500){
                currency[3] += money / 500;
                money %= 500;
            } else if(money >= 100){
                currency[2] += money / 100;
                money %= 100;
            } else if(money >= 50){
                currency[1] += money / 50;
                money %= 50;
            } else if(money >= 10){
                currency[0] += money / 10;
                money %= 10;
            }
        }

        System.out.println("앞에서 순서대로 10원, 50원, 100원, 500원, 1000원, 5000원, 10000원, 50000원");
        for(int i : currency) System.out.print(i + " ");
    }
}
