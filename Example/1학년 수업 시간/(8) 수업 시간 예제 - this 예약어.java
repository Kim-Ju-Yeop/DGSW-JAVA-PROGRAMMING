package Example;

public class ThisInst {

    private int data;

    // ThisInit 클래스의 매개변수 생성자
    public ThisInst(int data){
        this.data = data;
    }

    // ThisInst 의 맴버변수인 data 변수의 값을 매개변수로 입력 받아 설정하는 setData 매서드
    public void setData(int data){
        this.data = data;
    }

    // ThisInst 클래스의 맴버변수인 data 변수의 값을 반환한다.
    public int getData(){
        return this.data;
    }
}

class ThisInst_test{

    public static void main(String[] args) {

        // ThisInst 클래스를 참조해서 thisInst 인스턴스를 생성하면서 매개변수로 int 형 정수 99를 전달하고 있습니다.
        ThisInst thisInst = new ThisInst(99);
        System.out.println(thisInst.getData());

        // thisInst 인스턴스를 참조해서 setData 매서드를 호출하면서 77 정수를 매개변수로 전달하고있습니다.
        thisInst.setData(77);

        System.out.println(thisInst.getData());
    }
}
