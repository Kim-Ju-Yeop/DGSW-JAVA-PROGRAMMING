package class04_28;

public class Calculator {

    // Plus
    public int plus(int a, int b){
        return a+b;
    }
    public double plus(double a, double b){
        return a+b;
    }

    // Minus
    public int minus(int a, int b){
        return a-b;
    }
    public double minus(double a, double b){
        return a-b;
    }

    // Multi
    public int multi(int a, int b){
        return a*b;
    }
    public double multi(double a, double b){
        return a*b;
    }

    // Divide
    public int divide(int a, int b){
        return a/b;
    }
    public double divide(double a, double b){
        return a/b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int intValue;
        double doubleValue;

        // Plus
        intValue = calculator.plus(3, 5);
        doubleValue = calculator.plus(3.14, 3.14);

        // Minus
        intValue = calculator.minus(3, 5);
        doubleValue = calculator.minus(3.14, 3.14);

        // Multi
        intValue = calculator.multi(3, 5);
        doubleValue = calculator.multi(3.14, 3.14);

        // Divide
        intValue = calculator.divide(3, 5);
        doubleValue = calculator.divide(3.14, 3.14);
    }
}
