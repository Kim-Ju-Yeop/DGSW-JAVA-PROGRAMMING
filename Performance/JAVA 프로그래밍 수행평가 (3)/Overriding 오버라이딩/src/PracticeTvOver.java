// ����2
// �������̵� ����� Ȱ���Ͽ� SmartTvOver Ŭ������ TvOver Ŭ������ �ż������ �������̵� �Ͽ� ���ǿ� �ش��ϰ� �ڵ带 �ۼ��Ͻÿ�.
public class PracticeTvOver {
	public static void main(String[] args) {
		SmartTvOver tv = new SmartTvOver(10);
		
		tv.volumUp();
		System.out.println("���� ������ : " + tv.volum + "�Դϴ�.");
		
		tv.volumDown();
		tv.volumDown();
		System.out.println("���� ������ : " + tv.volum + "�Դϴ�.");
		
		tv.normalVolUp();
		System.out.println("���� ������ : " + tv.volum + "�Դϴ�.");
		
		tv.normalVolDown();
		System.out.println("���� ������ : " + tv.volum + "�Դϴ�.");
		
		tv.volumDown();
		tv.volumDown();
		System.out.println("���� ������ : " + tv.volum + "�Դϴ�.");
	}
}
