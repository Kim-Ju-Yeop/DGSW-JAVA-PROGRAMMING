public class TvOver {
	int volum;
	
	TvOver(int volum){
		this.volum = volum;
	}
	
	public void volumUp() {
		
		if(this.volum < 100) {
			this.volum += 1;
		}
	}
	
	public void volumDown() {
		
		if(this.volum > 0) {
			this.volum -= 1;
		}
	}
}
