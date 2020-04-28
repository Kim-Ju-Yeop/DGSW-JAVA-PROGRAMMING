package Ex_Overriding;

class Cake {

    int b = 0;

    public void yummy() { 
        System.out.println("Yummy Cake");
    }
}
   
class CheeseCake extends Cake{
    int a = 0;
    public void yummy() {
        System.out.println("Yummy Cheese Cake");
    }
}

public class YummyCakeOverriding {
    public static void main(String[] args) {

        // CheesesCake 클래스가 Cake 클래스를 상속해야지만 형 변환이 가능하다.
        // 하지만 상속관계라 하더라도 CheeseCake 의 변수 및 매서드는 참조 불가능하다.
        Cake c1 = new CheeseCake();
        CheeseCake c2 = new CheeseCake();

        c1.yummy();
        c2.yummy();
    }
}