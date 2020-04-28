// 문제2
// 오버라이딩 기능을 활용하여 SmartTvOver 클래스가 TvOver 클래스의 매서드들을 오버라이딩 하여 조건에 해당하게 코드를 작성하시오.
public class PracticeTvOver {
	public static void main(String[] args) {
		SmartTvOver tv = new SmartTvOver(10);
		
		tv.volumUp();
		System.out.println("현재 볼륨은 : " + tv.volum + "입니다.");
		
		tv.volumDown();
		tv.volumDown();
		System.out.println("현재 볼륨은 : " + tv.volum + "입니다.");
		
		tv.normalVolUp();
		System.out.println("현재 볼륨은 : " + tv.volum + "입니다.");
		
		tv.normalVolDown();
		System.out.println("현재 볼륨은 : " + tv.volum + "입니다.");
		
		tv.volumDown();
		tv.volumDown();
		System.out.println("현재 볼륨은 : " + tv.volum + "입니다.");
	}
}
