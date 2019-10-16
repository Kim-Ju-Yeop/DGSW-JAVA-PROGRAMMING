package Example;

public class InstCnt {

    // static 예약어를 사용하여 instNum 변수를 생성
    static int instNum = 100;

    // Default 생성자
    public InstCnt(){
        instNum++;
        System.out.println("인스턴스 생성 : " + instNum);
    }
}

class InstCnt_test{

    public static void main(String[] args) {

        // InstCnt 클래스를 사용하여 instNum static 변수의 값을 -15합니다.
        InstCnt.instNum -= 15;
        System.out.println(InstCnt.instNum);
    }
}
