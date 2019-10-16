// 7. 어떠한 클래스에서 static 변수를 생성한 후 main 함수에서 그 클래스의 인스턴스를 생성하지 않고 클래스를 직접적으로 참조해서 static 변수의 값의 변화를 나타내는 코드를 작성하시오
package Example;

public class InstCnt {
	
	static int instNum = 100;
	
	// InstCnt 클래스의 생성자
	public InstCnt() {
		
		instNum++;
		System.out.println("인스턴스 생성 : " + instNum);
	}
}

class InstCnt_Test{
	
	public static void main(String[] args) {
		
		// InstCnt 클래스를 참조하여 인스턴스를 생성하지 않고 InstCnt 클래스의 instNum static 맴버변수의 값을 직접적으로 참조하고있습니다.
		InstCnt.instNum -= 15;
		
		// 따라서 InstCnt 클래스를 참조해서 인스턴스를 생성하지 않았기 때문에 생성자에 포함된 코드는 실행하지 않고 85 값이 출력되는 것을 볼 수 있습니다.
		System.out.println(InstCnt.instNum);
	}
}
