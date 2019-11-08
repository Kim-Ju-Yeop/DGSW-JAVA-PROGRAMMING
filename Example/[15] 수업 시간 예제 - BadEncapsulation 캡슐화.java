package First;

public class BadEncapsulation {
    public static void main(String[] args) {
        ColdPatient coldPatient = new ColdPatient();

        coldPatient.takeSinivelCap(new SinivelCap()); // 콧물 캡슐 구매 후 복용
        coldPatient.takeSneezeCap(new SneezeCap()); // 재채기 캡슐 구매 후 복용
        coldPatient.takeSnuffleCap(new SnuffleCap()); // 코막힘 캡슐 구매 후 복용
    }
}

// 콧물 처치용 캡슐
class SinivelCap{
    public void take(){
        System.out.println("콧물이 멈춥니다.");
    }
}

// 재채기 처치용 캡슐
class SneezeCap{
    public void take(){
        System.out.println("재채기가 멈춥니다.");
    }
}

// 코막힘 처치용 캡슐
class SnuffleCap{
    public void take(){
        System.out.println("코가 뚫립니다.");
    }
}

// 각각의 클래스를 한 번에 모아주는 클래스
class ColdPatient {
    public void takeSinivelCap(SinivelCap cap) {
        cap.take();
    }

    public void takeSneezeCap(SneezeCap cap) {
        cap.take();
    }

    public void takeSnuffleCap(SnuffleCap cap) {
        cap.take();
    }
}
