public class TvEx {
	public static void main(String[] args) {
		
		Tv tv1 = new Tv(40, 123);
		Tv tv2 = new Tv(32, 234, "LG");
		Tv tv3 = new Tv(345, "���");
		Tv tv4 = new Tv(456);
		
		System.out.println("���Բ��� �ֹ��Ͻ� ��ǰ�� ��ǰ��ȣ " + tv1.pNum + ", " + tv1.inch + "��ġ, " + tv1.manufacturer+"��ǰ�� TV�Դϴ�." );
		System.out.println("���Բ��� �ֹ��Ͻ� ��ǰ�� ��ǰ��ȣ " + tv2.pNum + ", " + tv2.inch + "��ġ, " + tv2.manufacturer+"��ǰ�� TV�Դϴ�." );
		System.out.println("���Բ��� �ֹ��Ͻ� ��ǰ�� ��ǰ��ȣ " + tv3.pNum + ", " + tv3.inch + "��ġ, " + tv3.manufacturer+"��ǰ�� TV�Դϴ�." );
		System.out.println("���Բ��� �ֹ��Ͻ� ��ǰ�� ��ǰ��ȣ " + tv4.pNum + ", " + tv4.inch + "��ġ, " + tv4.manufacturer+"��ǰ�� TV�Դϴ�." );
	}
}
