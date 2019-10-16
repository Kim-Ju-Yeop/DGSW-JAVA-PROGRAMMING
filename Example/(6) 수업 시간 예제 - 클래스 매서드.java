package Example;

public class NumberPrinter {

    private int myNum  = 0;

    // Int 정수
    public static void showInt(int num){
        System.out.println(num);
    }

    // Double 실수
    public static void showDouble(double num){
        System.out.println(num);
    }

    // myNum 변수 설정
    public void setMyNumber(int num){
        myNum = num;
    }

    // myNum 변수 출력
    public void showMyNumber(){
        showInt(myNum);
    }
}

class NumberPrinter_test{

    public static void main(String[] args) {

        NumberPrinter.showInt(20);

        // NumberPrinter 클래스 참조해서 numberPrinter 인스턴스 생성
        NumberPrinter numberPrinter = new NumberPrinter();

        numberPrinter.showDouble(3.15);
        numberPrinter.setMyNumber(75);
        numberPrinter.showMyNumber();
    }
}
