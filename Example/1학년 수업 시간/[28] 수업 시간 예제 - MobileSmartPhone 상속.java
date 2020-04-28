package Ex_Overriding;

class MobilePhone {
    protected String number;

    public MobilePhone(String number){
        this.number = number;
    }

    public void answer(){
        System.out.println("Hi~ from " + number);
    }
}

class SmartPhone extends MobilePhone{

    private String androidVer;

    public SmartPhone(String number, String androidVer) {
        super(number);
        this.androidVer = androidVer;
    }

    public void playApp(){
        System.out.println("App is running in " + androidVer);
    }
}

public class MobileSmartPhone{
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("010-6392-7114", "Pie");
        phone.answer();
        phone.playApp();
    }
}
