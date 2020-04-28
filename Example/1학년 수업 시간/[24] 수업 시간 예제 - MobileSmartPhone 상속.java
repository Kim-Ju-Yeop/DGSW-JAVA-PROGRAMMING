package Ex_Inheritance;

class MobilePhone{
    protected String number;

    // Mobile 클래스 매개변수 생성자
    public MobilePhone(String number){
        this.number = number;
    }

    public void answer(){
        System.out.println("Hi~ from " + number);
    }
}

class SmartPhone extends MobilePhone{
    private String androidVer;

    // SmartPhone 클래스 매개변수 생성자
    public SmartPhone(String number, String version){
        super(number);
        androidVer = version;
    }

    public void playApp(){
        System.out.println("App is running in " + androidVer);
    }
}

public class MobileSmartPhone {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("010-6392-7114", "PIE");
        phone.answer();
        phone.playApp();
    }
}
