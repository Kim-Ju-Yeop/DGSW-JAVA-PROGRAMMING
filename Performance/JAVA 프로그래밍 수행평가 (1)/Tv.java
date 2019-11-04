// 문제 1 Tv 클래스 안에 맴버변수로 inch, pNum, manufacturer 변수를 선언하고 생성자 오버로딩 기능을 사용하여 다양한 생성자를 생성하여라
// main 함수 안에서 Tv 클래스를 생성할 때 매개변수로 입력받아라 pNum 의 값은 무조건 입력이 되어야한다. inch, manufacturer 의 값이 존재하지 않는다면 32, 삼성을 디폴트로 설정하여라
// 입력한 값에 따라 올바른 결과가 나오도록 출력을 하여라.

public class Tv {
	
	int inch = 32;
	int pNum;
	String manufacturer = "삼성";
	
	// inch, pNum, manufacturer 매개변수 3개
	public Tv(int inch, int pNum, String manufacturer) {
		
		if(inch == 32) {
			this.inch = inch;
		} else if(inch == 40) {
			this.inch = inch;
		} else if(inch == 42) {
			this.inch = inch;
		} else {
			System.out.println("옳지 않은 값이 입력되어 기본 32인치로 설정합니다.");
		}
		
		if(manufacturer == "한성") {
			this.manufacturer = "한성";
		} else if(manufacturer == "LG") {
			this.manufacturer = "LG";
		} else if(manufacturer == "대우") {
			this.manufacturer = "대우";
		} else {
			System.out.println("저희 회사 제품이 아닙니다.");
		}
		
		this.pNum = pNum;
	}
	
	// pNum, manufacturer 매개변수 2개
	public Tv(int pNum, String manufacturer) {
		if(manufacturer == "한성") {
			this.manufacturer = "한성";
		} else if(manufacturer == "LG") {
			this.manufacturer = "LG";
		} else if(manufacturer == "대우") {
			this.manufacturer = "대우";
		} else {
			System.out.println("저희 회사 제품이 아닙니다.");
		}
		
		this.pNum = pNum;
	}
	
	// inch, pNum 매개변수 2개
	public Tv(int inch, int pNum) {
		
		if(inch == 32) {
			this.inch = inch;
		} else if(inch == 40) {
			this.inch = inch;
		} else if(inch == 42) {
			this.inch = inch;
		} else {
			System.out.println("옳지 않은 값이 입력되어 기본 32인치로 설정합니다.");
		}
		
		
		this.pNum = pNum;
	}
	
	// pNum 매개변수 1개
	public Tv(int pNum) {
		this.pNum = pNum;
	}
	
}
