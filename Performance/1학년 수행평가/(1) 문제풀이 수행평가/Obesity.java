// ���� 2 �ɹ����� height, weight �� private ���� �����ڷ� ������ �ϰ� ����ڷ� ���� ���� �Է¹޾ƶ�.
// ���� height �� ���̰� 100 �̻� 200 �̸��� �ƴ� ��� ���� ǥ�ø� ���־��, weight �� ���԰� 0 ������ �� ���� ǥ�ø� ���־��.
// �� �� ���Ŀ� �°� ����, ��ü��, ���� ǥ�õǵ��� �ڵ��� �Ͽ���

public class Obesity {
	
	// �ɹ����� private ����
	private int height;
	private int weight;
	
	// standardBodyW �żҵ�
	public double standardBodyW() {
		if(height < 150) {
			return height - 100;
		} else if(height >= 150 && height < 160) {
			return (height - 150) / 2 + 50;
		} else {
			return (height - 100) * 0.9;
		}
	}
	
	// dgree �żҵ�
	public double dgree(double normal_weight) {
		return (weight - normal_weight) * 100 / normal_weight;
	}
	
	// rating �żҵ�
	public String rating(double rate) {
		if(rate <= 10) {
			return "����";
		}else if(rate > 10 && rate <= 20 ) {
			return "��ü��";
		} else {
			return "��";
		}
	}
	
	// getter, setter �Լ�
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
