package class05_12.ex1;

public class Dog implements Printable, Countable{

    private int count = 0;

    @Override
    public void print() {
        System.out.println("깅아지");
    }

    @Override
    public int count(){
        return ++count;
    }

    public void eat(){
        System.out.println("개 사료를 먹어요");
    }


    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.print();
        dog.eat();
        System.out.println(dog.count());

        Printable printable = new Dog();
        printable.print();

        Countable countable = new Dog();
        System.out.println(countable.count());

        Printable printable2 = new Cat();
        printable2.print();
    }
}
