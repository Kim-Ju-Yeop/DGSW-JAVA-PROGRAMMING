// 7. ��� Ŭ�������� static ������ ������ �� main �Լ����� �� Ŭ������ �ν��Ͻ��� �������� �ʰ� Ŭ������ ���������� �����ؼ� static ������ ���� ��ȭ�� ��Ÿ���� �ڵ带 �ۼ��Ͻÿ�
package Example;

public class InstCnt {
	
	static int instNum = 100;
	
	// InstCnt Ŭ������ ������
	public InstCnt() {
		
		instNum++;
		System.out.println("�ν��Ͻ� ���� : " + instNum);
	}
}

class InstCnt_Test{
	
	public static void main(String[] args) {
		
		// InstCnt Ŭ������ �����Ͽ� �ν��Ͻ��� �������� �ʰ� InstCnt Ŭ������ instNum static �ɹ������� ���� ���������� �����ϰ��ֽ��ϴ�.
		InstCnt.instNum -= 15;
		
		// ���� InstCnt Ŭ������ �����ؼ� �ν��Ͻ��� �������� �ʾұ� ������ �����ڿ� ���Ե� �ڵ�� �������� �ʰ� 85 ���� ��µǴ� ���� �� �� �ֽ��ϴ�.
		System.out.println(InstCnt.instNum);
	}
}
