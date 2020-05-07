package class05_07;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {

    int randomAnswer;
    String userAnswer;

    int[] userRecord = new int[3];

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public static void main(String[] args) {
        RockScissorsPaper rockPaperScissors = new RockScissorsPaper();
        rockPaperScissors.showMenu();
    }

    private void showMenu(){
        println("1.가위 2. 바위 3. 보 Q. 종료");
        inputAnswer();
    }

    private void inputAnswer(){
        userAnswer = scanner.nextLine();

        if(!userAnswer.equals("Q")) CompareAnswer();
        else println("프로그램을 종료합니다.");
    }

    private void CompareAnswer(){
        randomAnswer = random.nextInt(3) + 1;

        if(randomAnswer == Integer.parseInt(userAnswer)) userRecord[1]++;
        else if(randomAnswer == 1 && Integer.parseInt(userAnswer) == 2) userRecord[0]++;
        else if(randomAnswer == 1 && Integer.parseInt(userAnswer) == 3) userRecord[2]++;
        else if(randomAnswer == 2 && Integer.parseInt(userAnswer) == 1) userRecord[2]++;
        else if(randomAnswer == 2 && Integer.parseInt(userAnswer) == 3) userRecord[0]++;
        else if(randomAnswer == 3 && Integer.parseInt(userAnswer) == 1) userRecord[0]++;
        else if(randomAnswer == 3 && Integer.parseInt(userAnswer) == 2) userRecord[2]++;

        showRecord();
        println("");
        showMenu();
    }

    private void showRecord(){
        println(userRecord[0] + "승 " + userRecord[1] + "무 " + userRecord[2] + "패");
    }

    private void println(String text){
        System.out.println(text);
    }
}
