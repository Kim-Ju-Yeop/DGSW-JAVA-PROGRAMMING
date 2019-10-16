// 1. main 함수에서 Calculation 매서드를 호출하여 파라미터로 전달한 값으로 사칙연산을 수행하여라.
package Question;

public class Method {
	
	public static void main(String[] args) {
	
		Calculation(3,5); // Calculation 매서드를 호출하고있습니다. 파라미터로 3, 5 를 전달하고있습니다.
	}
	
	public static void Calculation(int i, int j) {
		
		// 전달받은 매개변수로 사칙 연산을 진행하고있습니다.
		System.out.println("덧셈 결과 : " + (i + j));
		System.out.println("뻴셈 결과 : " + (i - j));
		System.out.println("곱셈 결과 : " + (i * j));
		System.out.println("나눗셈 몫 : " + (i / j));
		System.out.println("나눗셈 나머지 : " + (i % j));
		
	}
}
