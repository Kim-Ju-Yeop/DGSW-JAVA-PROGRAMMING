import java.util.Scanner;

public class CompareString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("비교할 첫번째 문자를 입력하세요. : ");		
		String str1 = new String(sc.nextLine());

		System.out.print("비교할 두번째 문자를 입력하세요. : ");
		String str2 = new String(sc.nextLine());
		
		if(str1.equals(str2))
			System.out.println("두 문자는 같은 문자입니다.");
		else
			System.out.println("두 문자는 다른 문자입니다.");	
	}
	
}