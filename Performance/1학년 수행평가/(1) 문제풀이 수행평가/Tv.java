// ���� 1 Tv Ŭ���� �ȿ� �ɹ������� inch, pNum, manufacturer ������ �����ϰ� ������ �����ε� ����� ����Ͽ� �پ��� �����ڸ� �����Ͽ���
// main �Լ� �ȿ��� Tv Ŭ������ ������ �� �Ű������� �Է¹޾ƶ� pNum �� ���� ������ �Է��� �Ǿ���Ѵ�. inch, manufacturer �� ���� �������� �ʴ´ٸ� 32, �Ｚ�� ����Ʈ�� �����Ͽ���
// �Է��� ���� ���� �ùٸ� ����� �������� ����� �Ͽ���.

public class Tv {
	
	int inch = 32;
	int pNum;
	String manufacturer = "�Ｚ";
	
	// inch, pNum, manufacturer �Ű����� 3��
	public Tv(int inch, int pNum, String manufacturer) {
		
		if(inch == 32) {
			this.inch = inch;
		} else if(inch == 40) {
			this.inch = inch;
		} else if(inch == 42) {
			this.inch = inch;
		} else {
			System.out.println("���� ���� ���� �ԷµǾ� �⺻ 32��ġ�� �����մϴ�.");
		}
		
		if(manufacturer == "�Ѽ�") {
			this.manufacturer = "�Ѽ�";
		} else if(manufacturer == "LG") {
			this.manufacturer = "LG";
		} else if(manufacturer == "���") {
			this.manufacturer = "���";
		} else {
			System.out.println("���� ȸ�� ��ǰ�� �ƴմϴ�.");
		}
		
		this.pNum = pNum;
	}
	
	// pNum, manufacturer �Ű����� 2��
	public Tv(int pNum, String manufacturer) {
		if(manufacturer == "�Ѽ�") {
			this.manufacturer = "�Ѽ�";
		} else if(manufacturer == "LG") {
			this.manufacturer = "LG";
		} else if(manufacturer == "���") {
			this.manufacturer = "���";
		} else {
			System.out.println("���� ȸ�� ��ǰ�� �ƴմϴ�.");
		}
		
		this.pNum = pNum;
	}
	
	// inch, pNum �Ű����� 2��
	public Tv(int inch, int pNum) {
		
		if(inch == 32) {
			this.inch = inch;
		} else if(inch == 40) {
			this.inch = inch;
		} else if(inch == 42) {
			this.inch = inch;
		} else {
			System.out.println("���� ���� ���� �ԷµǾ� �⺻ 32��ġ�� �����մϴ�.");
		}
		
		
		this.pNum = pNum;
	}
	
	// pNum �Ű����� 1��
	public Tv(int pNum) {
		this.pNum = pNum;
	}
	
}
