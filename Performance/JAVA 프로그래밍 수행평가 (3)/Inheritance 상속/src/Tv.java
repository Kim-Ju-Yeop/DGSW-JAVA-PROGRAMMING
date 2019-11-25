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
			System.out.println("sbs입니다.");
			this.channel = channel;
			break;
			
		case 7:
			System.out.println("kbs입니다.");
			this.channel = channel;
			break;
			
		case 11:
			System.out.println("mbc입니다.");
			this.channel = channel;
			break;
			
			default:
				System.out.println("옳지 않은 선택입니다.");
		}
	}
}
