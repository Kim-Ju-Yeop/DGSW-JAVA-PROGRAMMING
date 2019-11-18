package Ex_Inheritance;

class Man{
    String name;
    protected static int count = 0;

    // Man 매개변수 생성자
    public Man(String name){
        this.name = name;
    }

    public void tellYourName(){
        System.out.println("My name is " + name);
    }
}

public class BusinessMan extends Man{
    String company;
    String position;

    public BusinessMan(String name, String company, String position){

        // super() 함수를 사용해서 BusinessMan 클래스가 상속 받고 있는 Man 클래스의 매개변수 생성자를 선언해준다.
        super(name);
        this.company = company;
        this.position = position;
    }
    public void tellYourInfo(){
        tellYourName();
        System.out.println("My company is " + company);
        System.out.println("My position is " + position);
        System.out.println(Man.count);
    }
}

class ManEx{
    public static void main(String[] args) {
        BusinessMan b1 = new BusinessMan("김주엽", "kakao", "Android Developer");
        b1.tellYourInfo();
    }
}
