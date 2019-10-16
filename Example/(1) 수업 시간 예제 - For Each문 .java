// For Each 문 사용 예제
package Example;

public class For_Each {
	
	public static void main(String[] args) {
		
		System.out.println("데이터의 크기 : " + args.length);
		
		// for each 문
		// String 형 str 변수에 args 배열에 있는 값들을 순서대로 대입을 합니다.
		for(String str : args) {
			
			// str 변수에 대입된 값들을 순차적으로 출력합니다.
			System.out.print(str + " ");
		}
	}
}
