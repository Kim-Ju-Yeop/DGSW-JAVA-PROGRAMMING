public class Tv {
	int volum;
	int channel;
	
	Tv(int volum, int channel){
		this.volum = volum;
		this.channel = channel;
	}
	
	public void volum(int volum) {
		
		if(volum >= 0 && volum <= 100) {
			this.volum = volum;
		}
	}
	
	public void channel(int channel) {
		
		switch(channel) {
		case 6:
			System.out.println("sbs�Դϴ�.");
			this.channel = channel;
			break;
			
		case 7:
			System.out.println("kbs�Դϴ�.");
			this.channel = channel;
			break;
			
		case 11:
			System.out.println("mbc�Դϴ�.");
			this.channel = channel;
			break;
			
			default:
				System.out.println("���� ���� �����Դϴ�.");
		}
	}
}
