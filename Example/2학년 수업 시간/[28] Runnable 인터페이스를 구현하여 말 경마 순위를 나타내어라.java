package class05_13.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Horse implements Runnable {

    private int no;
    private static List<Integer> rank = new ArrayList<>();

    public Horse(int no){
        this.no = no;
    }

    @Override
    public void run() {
        int distance = 0;

        while(distance < 10000){
            distance += makeRandomNumber();
            System.out.println(String.format("말 %d : %d", no, distance));

            try{ Thread.sleep(100L); }
            catch (Exception e){ e.printStackTrace(); }
        }
        showRank(no);
    }

    public int makeRandomNumber(){
        Random random = new Random();

        int value = random.nextInt(50) + 100;
        return value;
    }

    public void showRank(int no){
        rank.add(no);

        if(rank.size() == 8) {
            for(int i = 0; i < rank.size(); i++){
                System.out.println(i + 1 + "등 : 말" + rank.get(i) + "번");
            }
        }
    }

    public static void main(String[] args) {
        Horse horse;

        for(int i = 0; i < 8; i++) {
            horse = new Horse(i + 1);
            new Thread(horse).start();
        }
    }
}
