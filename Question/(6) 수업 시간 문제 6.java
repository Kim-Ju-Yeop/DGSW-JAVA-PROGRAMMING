// 6. ��� Ŭ������ static ������ �����ϰ� �� satic ������ ���� ��ȭ�� Ȯ���ϴ� �ڵ带 �ۼ��Ͻÿ�.
package Example;

public class AccessWay {
	
	static int num = 0;
	
	// AccessWay ������
	public AccessWay() {
		
		incrCnt();
	}
	
	// incrCnt() �ż���
	public void incrCnt() {
		
		num++;
	}
	
}

class AccessWay_Test{
	
	public static void main(String[] args) {
		
		// AccessWay Ŭ������ �����ؼ� way �ν��Ͻ��� �����Ͽ����ϴ�.
		// way �ν��Ͻ��� ������ �� AccessWay Ŭ���� ���� static ������ num ������ ���� �����˴ϴ�.
		AccessWay way = new AccessWay();
		
		way.num++; // way �ν��Ͻ��� �����ؼ� static ���� num ���� ������Ű�� �ֽ��ϴ�.
		
		System.out.println("num = " + AccessWay.num);
	}
}
