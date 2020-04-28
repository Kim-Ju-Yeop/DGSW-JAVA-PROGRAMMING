package Example;

public class Override {

    private int regiNum; // 주민등록번호
    private int passNum; // 여권번호

    // Person 클래스의 매개변수 생성자
    public Override(int regiNum, int passNum){
        this.regiNum = regiNum;
        this.passNum = passNum;
    }

    // Person 클래스의 다른 매개변수 생성자
    // Override 생성자를 오버라이딩 하고있습니다.
    public Override(int regiNum){
        this.regiNum = regiNum;
        this.passNum = 0;
    }

    // Person 클래스를 참조한 인스턴스의 정보를 출력해주는 showPersonalInfo() 매서드
    public void showPersonalInfo(){
        System.out.println("주민등록 번호 : " + regiNum);

        if(passNum != 0){
            System.out.println("여권 번호 : " + passNum + "\n");
        } else {
            System.out.println("여권을 가지고 있지 않습니다.");
        }
    }
}

class Override_test {

    public static void main(String[] args) {

        Override yes_person = new Override(1234, 5081325); // 주민등록번호와 여권번호가 존재하는 사람
        Override no_person = new Override(1234); // 주민등록번호만 존재하는 사람

        yes_person.showPersonalInfo();
        no_person.showPersonalInfo();
    }
}
