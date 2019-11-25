public class SmartTvOver extends TvOver {
	
	SmartTvOver(int volum){
		super(volum);
	}
	
	public void volumUp() {
		System.out.println("SmartTv는 사운드바를 통해 음질이 향상되었습니다.");
		
		if(super.volum < 100) {
			
			switch(super.volum) {
			case 97:
			case 98:
			case 99:
				super.volum = 100;
				break;
				
				default:
					super.volum += 4;
			}
		}
	}
	
	public void volumDown() {
		System.out.println("SmartTv는 사운드바를 통해 음질이 향상되었습니다.");
		
		if(super.volum > 0) {
			
			switch(super.volum) {
			case 3:
			case 2:
			case 1:
				super.volum = 0;
				break;
				
				default:
					super.volum -= 4;
			}
		}
	}
	
	public void normalVolUp() {
		System.out.println("사운드바를 사용하지 않습니다.");
		
		super.volumUp();
	}
	
	public void normalVolDown() {
		System.out.println("사운드바를 사용하지 않습니다.");
		
		super.volumDown();
	}
}
