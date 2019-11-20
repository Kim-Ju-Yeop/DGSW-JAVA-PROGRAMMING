package Ex_Overriding;

class Cake{
    public void yummy(){
        System.out.println("Yummy Cake");
    }
}

class CheeseCake extends Cake{
    // Cake 클래스의 yummy 매서드를 오버라이딩
    @Override
    public void yummy(){
        System.out.println("Yummy Cheese Cake");
    }
}

public class YummyCakeOverriding {
    public static void main(String[] args) {
        Cake c1 = new CheeseCake();
        CheeseCake c2 = new CheeseCake();

        c1.yummy();
        c2.yummy();
    }
}
