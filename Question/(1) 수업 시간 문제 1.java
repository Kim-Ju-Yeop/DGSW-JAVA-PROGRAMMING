// 1. main �Լ����� Calculation �ż��带 ȣ���Ͽ� �Ķ���ͷ� ������ ������ ��Ģ������ �����Ͽ���.
package Question;

public class Method {
	
	public static void main(String[] args) {
	
		Calculation(3,5); // Calculation �ż��带 ȣ���ϰ��ֽ��ϴ�. �Ķ���ͷ� 3, 5 �� �����ϰ��ֽ��ϴ�.
	}
	
	public static void Calculation(int i, int j) {
		
		// ���޹��� �Ű������� ��Ģ ������ �����ϰ��ֽ��ϴ�.
		System.out.println("���� ��� : " + (i + j));
		System.out.println("�y�� ��� : " + (i - j));
		System.out.println("���� ��� : " + (i * j));
		System.out.println("������ �� : " + (i / j));
		System.out.println("������ ������ : " + (i % j));
		
	}
}
