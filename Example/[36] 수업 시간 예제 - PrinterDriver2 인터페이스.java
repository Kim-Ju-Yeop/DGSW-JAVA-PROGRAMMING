package Ex_interface;

interface Printable2{
    void print(String doc);
    default void printCMYK(String doc){}
}

class Prn731Drv implements Printable2{

    @Override
    public void print(String doc) {
        System.out.println("From MD-731 printer");
        System.out.println(doc);
    }
}

class Prn909Drv implements Printable2{

    @Override
    public void print(String doc) {
        System.out.println("From MD-909 black & white ver");
        System.out.println(doc);
    }

    @Override
    public void printCMYK(String doc) {
        System.out.println("From MD-909 CMYK ver");
        System.out.println(doc);
    }
}

public class PrinterDriver2 {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";

        Printable2 prn1 = new Prn731Drv();
        prn1.print(myDoc);

        System.out.println();

        prn1 = new Prn909Drv();
        prn1.print(myDoc);
    }
}

