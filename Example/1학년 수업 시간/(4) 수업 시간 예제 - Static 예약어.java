package Example;

public class AccessWay {

    public static int num = 0;

    // Default 생성자
    public  AccessWay(){
        incrCnt();
    }

    // incrCnt() 매서드
    // AccessWay 클래스가 호출될 때 incrCnt 매서드를 호출
    public void incrCnt(){
        num++;
    }
}
class AccessWay_test{

    public static void main(String[] args) {

        // AccessWay 클래스를 참조해서 way 인스턴스를 생성
        AccessWay way = new AccessWay();

        // way 인스턴스를 참조해서 AccessWay 클래스에 속한 static 변수인 num 클래스 변수의 값을 증가
        way.num++;

        // 그 후 AccessWay 클래스의 static 즉 클래스 변수 num 값을 출력
        System.out.println("num = " + AccessWay.num);
    }
}
