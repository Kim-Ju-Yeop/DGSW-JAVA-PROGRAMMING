public class SmartTv extends Tv{
	String tvVersion;
	int tvsize;
	
	SmartTv(int volum, int channel, int tvsize, String tvVersion){
		super(volum, channel);
		
		this.tvsize = tvsize;
		this.tvVersion = tvVersion;
	}
	
	public void tvInfo() {
		System.out.println(this.tvsize + "인치 크기의 " + this.tvVersion + "의 스마트 Tv입니다.");
		System.out.println("현재 tv의 볼륨은 " + super.volum + "이며, 채널은 " + super.channel + "이 재생중입니다.");
	}
}
