package Ex_Overriding;

class Cake{
    public String toString(){
        System.out.println(super.toString()); // super.toString() 매서드를 호출하면서 주소값을 출력한다.
        return "My birthday cake";
    }
}

class CheeseCake extends Cake{

    // 현재 CheeseCake 클래스의 toString() 매서드는 Cake 클래스의 toString() 매서드를 오버라이딩 한 것이다.
    public String toString(){
        return "My birthday cheese cake";
    }
}

public class OverridingToString {
    public static void main(String[] args) {

        Cake c1 = new Cake();
        Cake c2 = new CheeseCake();

        System.out.println(c1); // Cake.toString() 출력
        System.out.println();

        System.out.println(c2); // CheeseCake.toString() 출력
    }
}
