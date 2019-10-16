// 5. �غ��� ���̸� Triangle Ŭ������ �ɹ������� �����ϰ� �ﰢ���� ���̸� ����ϴ� �Լ��� �غ��� ������ ���� �����ϴ� �Լ��� ����� ���������� �۵��ϵ��� �ڵ带 �ۼ��Ͻÿ�.
package Question;

public class Triangle {
	
	// Triangle Ŭ���� �ɹ� ����
	int base;
	int height;
	
	// Triangle Ŭ���� ������
	public Triangle(int base, int height) {
		
		this.base = base;
		this.height = height;
	}
	
	// ���� ��� �Լ�
	public void area() {
		
		int total = (base * height) / 2;
		System.out.println("�Է��Ͻ� �ﰢ���� ���̴� : " + total + "cm �Դϴ�.");
	}
	
	// �غ�, ���� ���� �Լ�
	public void change(int base, int height) {
		
		this.base  = base;
		this.height = height;
		System.out.println("�Է��Ͻ� ������ �غ��� ���̸� �����Ͽ����ϴ�.");
	}
	
}

// Triangle_Test 
class Triangle_Test {
	
	public static void main(String[] args) {
		
		Triangle triangle = new Triangle(15,30);
		triangle.area();
		
		triangle.change(5, 20);
		triangle.area();
	}
}
