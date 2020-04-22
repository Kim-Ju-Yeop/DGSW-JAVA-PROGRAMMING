package class04_22;

import java.util.Scanner;

public class StringReuse {

    private String sentence;

    public static void main(String[] args) {
        StringReuse stringReuse = new StringReuse();
        stringReuse.input();
        stringReuse.show();
    }

    private void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        sentence = scanner.nextLine();
    }

    private int length(){
        return sentence.length();
    }

    private int countA(){
        int i = 0;
        int count = 0;
        int index = 0;

        while(i < sentence.length()){
            if(sentence.indexOf("a", index) != -1){
                count++;
                index = sentence.indexOf("a", index) + 1;
            } i++;
        } return count;
    }

    private boolean contain(){
        return sentence.contains("at");
    }

    private void reverse(){
        for(int i = sentence.length() - 1; i >= 0; i--){
            System.out.print(sentence.charAt(i));
        }
    }

    private int countWord(){
        int count = 0;
        for(int i = 0; i < sentence.length(); i++)
            if(sentence.charAt(i) == ' ') count++;
            return count + 1;
    }

    private void show(){
        System.out.println("길이 : " + length());
        System.out.println("a의 개수 : " + countA());
        System.out.println("at 포함 여부 : " + contain());
        System.out.print("역순 : "); reverse();
        System.out.println("\n단어의 개수 : " + countWord());
    }
}
