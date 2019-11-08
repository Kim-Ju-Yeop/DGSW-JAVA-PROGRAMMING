package Third;

public class CompEncapsulation {
    public static void main(String[] args) {
        ColdPatient coldPatient = new ColdPatient();
        coldPatient.takeSinus(new SinusCap());
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

class SinusCap{
    SinivelCap sinivelCap = new SinivelCap();
    SneezeCap sneezeCap = new SneezeCap();
    SnuffleCap snuffleCap = new SnuffleCap();

    public void take(){
        sinivelCap.take();
        sneezeCap.take();
        snuffleCap.take();
    }
}

class ColdPatient{
    void takeSinus(SinusCap cap){
        cap.take();
    }
}