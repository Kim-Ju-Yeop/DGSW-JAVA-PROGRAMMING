import java.util.Scanner;

public class CompareString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ù��° ���ڸ� �Է��ϼ���. : ");		
		String str1 = new String(sc.nextLine());

		System.out.print("���� �ι�° ���ڸ� �Է��ϼ���. : ");
		String str2 = new String(sc.nextLine());
		
		if(str1.equals(str2))
			System.out.println("�� ���ڴ� ���� �����Դϴ�.");
		else
			System.out.println("�� ���ڴ� �ٸ� �����Դϴ�.");	
	}
	
}