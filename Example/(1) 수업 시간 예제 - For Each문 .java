// For Each �� ��� ����
package Example;

public class For_Each {
	
	public static void main(String[] args) {
		
		System.out.println("�������� ũ�� : " + args.length);
		
		// for each ��
		// String �� str ������ args �迭�� �ִ� ������ ������� ������ �մϴ�.
		for(String str : args) {
			
			// str ������ ���Ե� ������ ���������� ����մϴ�.
			System.out.print(str + " ");
		}
	}
}
