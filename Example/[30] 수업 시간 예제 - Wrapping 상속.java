package Ex_Overriding;

class Box {
    public void simpleWrap() { 
        System.out.println("Simple Wrapping");
    }
}

class PaperBox extends Box {
    public void paperWrap() {
        System.out.println("Paper Wrapping");
    }
}

class GoldPaperBox extends PaperBox {
    public void goldWrap() {
        System.out.println("Gold Wrapping");
    }
}

public class Wrapping {
    public static void main(String[] args) {
        Box box1 = new Box();
        PaperBox box2 = new PaperBox();
        GoldPaperBox box3 = new GoldPaperBox();
        
        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);
    }

    // 매개변수로 전달 받은 값을 Box 클래스로 형 변환을 하고 있다.
    public static void wrapBox(Box box) {

        // instanceof 예약어는 상속을 확인하는 것이다.
        if(box instanceof GoldPaperBox) {
            ((GoldPaperBox)box).goldWrap();
        }
        else if(box instanceof PaperBox) {
            ((PaperBox)box).paperWrap();
        }
        else {
            box.simpleWrap();
        }
    }
}