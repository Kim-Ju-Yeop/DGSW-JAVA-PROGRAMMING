public class TvEx {
	public static void main(String[] args) {
		
		Tv tv1 = new Tv(40, 123);
		Tv tv2 = new Tv(32, 234, "LG");
		Tv tv3 = new Tv(345, "대우");
		Tv tv4 = new Tv(456);
		
		System.out.println("고객님께서 주문하신 제품은 제품번호 " + tv1.pNum + ", " + tv1.inch + "인치, " + tv1.manufacturer+"제품의 TV입니다." );
		System.out.println("고객님께서 주문하신 제품은 제품번호 " + tv2.pNum + ", " + tv2.inch + "인치, " + tv2.manufacturer+"제품의 TV입니다." );
		System.out.println("고객님께서 주문하신 제품은 제품번호 " + tv3.pNum + ", " + tv3.inch + "인치, " + tv3.manufacturer+"제품의 TV입니다." );
		System.out.println("고객님께서 주문하신 제품은 제품번호 " + tv4.pNum + ", " + tv4.inch + "인치, " + tv4.manufacturer+"제품의 TV입니다." );
	}
}
