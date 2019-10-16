// 2. Method 기능을 사용하여 전달한 숫자가 소수인지 소수가 아닌지 boolean 기능을 사용하여 1부터 100까지 중 소수만 출력을 합니다.
package Question;

public class Q1 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			
			// check() 매서드를 호출하고 있으며 매개변수로 i 를 전달하고있습니다.
			// 만약 check() 매서드를 통해 전달 받은 값이 true 일 경우 i 를 출력합니다.
			if(check(i) == true) {
				
				System.out.println(i);
			}
		}
	}
	
	public static boolean check(int num) {
		
		if(num == 1) {
			
			return false;
		}
		
		// 숫자 2부터 반복문을 시작하는 이유는 1 은 모둔 자연수가 나누어 떨어지기 때문입니다.
		for(int i = 2; i < num; i++) {
			
			// 숫자 2부터 전달 받은 값을 나눈 후 만약 나누어 떨어지는 경우가 있다면 소수가 아니기 때문에 false 를 전달합니다.
			if(num % i == 0) {
				return false;
			}
		}
		
		// 반복문을 모두 마쳤는데도 불구하고 나누어 떨어지는 것이 없다면 소수이므로 true 를 전달합니다.
		return true;
	}
}

