// 문제 1
// 상속을 활용하여 SmartTv 클래스가 Tv 클래스를 상속받게 하고 조건에 해당하게 코드를 작성하시오.
public class PracticeTv {
	public static void main(String[] args) {
		SmartTv tv = new SmartTv(10, 7, 32, "Ver.10");
		
		tv.volum(20);
		tv.channel(7);
		tv.tvInfo();
	}
}
