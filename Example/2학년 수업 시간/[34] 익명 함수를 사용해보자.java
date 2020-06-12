package class06_10.ex2;

interface Sound {
    void sound();
}

public class Animal {

    Sound sound;

    public void eat(){
        System.out.println("고기");
    }

    public void sound(){
        this.sound.sound();
    }

    public void setSound(Sound sound){
        this.sound = sound;
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setSound(new Sound() {
            @Override
            public void sound() {
                System.out.println("멍멍");
            }
        });

        Animal cat = new Animal();
        cat.setSound(new Sound() {
            @Override
            public void sound() {
                System.out.println("야옹");
            }
        });
    }
}
