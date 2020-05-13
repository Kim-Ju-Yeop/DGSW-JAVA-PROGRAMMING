package class05_13.ex1;

public class MyThread extends Thread {

    private String name;
    private long delay;

    public MyThread(String name, long delay){
        this.name = name;
        this.delay = delay;
    }

    @Override
    public void run() {
        System.out.println(name + " 스레드가 시작됨");
        for(int i = 0; i < 30; i++){
            System.out.println(name + " : " + i);

            try{ Thread.sleep(delay);}
            catch (Exception e){ }
        }
        System.out.println(name + " 스레드가 종료됨");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread("김주엽", 20L);
        thread.start();

        MyThread thread2 = new MyThread("여동민", 25L);
        thread2.start();

        MyThread thread3 = new MyThread("최한수", 50L);
        thread3.start();
    }
}
