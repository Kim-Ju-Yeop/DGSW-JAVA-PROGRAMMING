public class SmartTv extends Tv{
	String tvVersion;
	int tvsize;
	
	SmartTv(int volum, int channel, int tvsize, String tvVersion){
		super(volum, channel);
		
		this.tvsize = tvsize;
		this.tvVersion = tvVersion;
	}
	
	public void tvInfo() {
		System.out.println(this.tvsize + "��ġ ũ���� " + this.tvVersion + "�� ����Ʈ Tv�Դϴ�.");
		System.out.println("���� tv�� ������ " + super.volum + "�̸�, ä���� " + super.channel + "�� ������Դϴ�.");
	}
}
