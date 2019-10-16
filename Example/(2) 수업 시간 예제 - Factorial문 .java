package Example;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("3 factorial : " + factorial(3));
		System.out.println("12 factorial : " + factorial(12));
	}

	// Factorial 함수 (재귀함수)
	public static int factorial(int num) {
		
		if(num == 1) {
			
			return 1;
		} else {
			
			return num * factorial(num-1);
		}
	}
}
