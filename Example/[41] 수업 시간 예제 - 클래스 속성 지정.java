package class04_22;

public class Animal {

    // Animal 클래스의 속성 (멤버 변수)
    String sound;
    String name;
    String category;
    int countOfLegs;

    public static void main(String[] args) {
        Animal lion = new Animal();
        Animal salmon = new Animal();

        lion.name = "사자";
        lion.countOfLegs = 4;

        System.out.println(lion.name + lion.countOfLegs);
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCountOfLegs() {
        return countOfLegs;
    }

    public void setCountOfLegs(int countOfLegs) {
        this.countOfLegs = countOfLegs;
    }
}
