package Second;

public class OneClassEncapsulation {
    public static void main(String[] args) {
        ColdPatient coldPatient = new ColdPatient();
        coldPatient.takeSinus(new SinusCap());
    }
}

class SinusCap{
    public void sniTake(){
        System.out.println("콧물이 멈춥니다.");
    }
    public void sneTake(){
        System.out.println("재채기가 멈춥니다.");
    }
    public void snuTake(){
        System.out.println("코가 뚫닙니다.");
    }
    public void take(){
        sniTake();
        sneTake();
        snuTake();
    }
}

class ColdPatient{
    public void takeSinus(SinusCap cap){
        cap.take();
    }
}
