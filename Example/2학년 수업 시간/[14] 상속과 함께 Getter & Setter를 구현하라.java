package class04_29;

public class Animal {

    public Animal(){
        System.out.println("Animal 생성자 호출됨");
    }

    protected String name;
    protected String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}

class Cat extends Animal{

    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setName("고양이");
        cat.setSound("야옹");

        System.out.println(cat.getName() + " " + cat.getSound());
    }
}

class Dog extends Animal {

    public Dog(){
        System.out.println("Dog 생성자 호출됨");
    }

    private String nickName;
    public String getNickName(){
        return nickName;
    }
    public void setNickName(String nickName){
        this.nickName = nickName;
    }

    @Override
    public String getName(){
        return "이름 : " + super.getName();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal puppy = new Dog();

        dog.setName("강아지");
        puppy.setName("반려견");

        System.out.println(dog.getName());
        System.out.println(puppy.getName());
    }
}

