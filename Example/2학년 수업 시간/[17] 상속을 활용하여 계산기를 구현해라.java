package class05_06.five;

public abstract class Calculator {

    protected int value1, value2;

    public abstract int calculate();
    public abstract String getOperator();

    public void setOperand(int value1, int value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public void print(){
        System.out.println(String.format("%d %s %d = %d", value1, getOperator(), value2, calculate()));
    }

    public static void main(String[] args) {
        Calculator adder = new Adder();
        Calculator subTractor = new SubTractor();
        Calculator multiply = new Multiply();

        adder.setOperand(8, 5);
        adder.print();

        subTractor.setOperand(8, 5);
        subTractor.print();

        multiply.setOperand(8, 5);
        multiply.print();
    }
}

class Adder extends Calculator {

    @Override
    public int calculate(){
        return value1 + value2;
    }

    @Override
    public String getOperator(){
        return "+";
    }

    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.setOperand(4, 5);
        adder.print();
    }
}

class SubTractor extends Calculator {

    @Override
    public int calculate(){
        return value1 - value2;
    }

    @Override
    public String getOperator() {
        return "-";
    }

    public static void main(String[] args) {
        SubTractor subTractor = new SubTractor();
        subTractor.setOperand(4, 5);
        subTractor.print();
    }
}

class Multiply extends Calculator {

    @Override
    public int calculate() {
        return value1 * value2;
    }

    @Override
    public String getOperator() {
        return "*";
    }

    public static void main(String[] args) {
        Multiply multiply = new Multiply();
        multiply.setOperand(4, 5);
        multiply.print();
    }
}
