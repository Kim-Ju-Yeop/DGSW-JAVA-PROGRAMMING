// 6. 어떠한 클래스의 static 변수를 선언하고 그 satic 변수의 값의 변화를 확인하는 코드를 작성하시오.
package Example;

public class AccessWay {
	
	static int num = 0;
	
	// AccessWay 생성자
	public AccessWay() {
		
		incrCnt();
	}
	
	// incrCnt() 매서드
	public void incrCnt() {
		
		num++;
	}
	
}

class AccessWay_Test{
	
	public static void main(String[] args) {
		
		// AccessWay 클래스를 참조해서 way 인스턴스를 생성하였습니다.
		// way 인스턴스를 생성할 시 AccessWay 클래스 안의 static 변수인 num 변수의 값이 증가됩니다.
		AccessWay way = new AccessWay();
		
		way.num++; // way 인스턴스를 참조해서 static 변수 num 값을 증가시키고 있습니다.
		
		System.out.println("num = " + AccessWay.num);
	}
}
