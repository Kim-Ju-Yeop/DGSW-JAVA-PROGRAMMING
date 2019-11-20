package Ex_Overriding;

class MobilePhone2{
    protected String number;

    public MobilePhone2(String number){
        this.number = number;
    }

    public void answer(){
        System.out.println("Hi~ from " + number);
    }
}

class SmartPhone2 extends MobilePhone2{
    private String androidVer;

    public SmartPhone2(String number, String androidVer){
        super(number);
        this.androidVer = androidVer;
    }

    public void playApp(){
        System.out.println("App is running in " + androidVer);
    }
}

public class MobileSmartPhoneRef {
    public static void main(String[] args) {
        SmartPhone2 ph1 = new SmartPhone2("010-1234-5678", "Oreo");
        MobilePhone2 ph2 = new SmartPhone2("010-6392-7114", "Pie");

        ph1.answer();
        ph1.playApp();
        System.out.println();

        ph2.answer();
        // ph2.playApp();
    }
}
