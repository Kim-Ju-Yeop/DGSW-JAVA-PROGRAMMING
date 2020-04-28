package Example;

public class FormatString {
    public static void main(String[] args) {
        int age = 17;
        double height = 164.5;
        String name = "Kim Ju Yeop";

        System.out.printf(" name : %s\n", name);
        System.out.printf(" age : %d\n", age);
        System.out.printf(" height : %e\n\n", height);

        System.out.printf(" %d - %o - %x\n\n", 77, 77, 77);
        System.out.printf(" %g\n", 0.00014);
        System.out.printf(" %g\n", 0.000014);
    }
}
