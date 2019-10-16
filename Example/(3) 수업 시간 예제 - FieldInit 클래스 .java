package Example;

// FieldInit 클래스
public class FieldInit {
	
	// 기본형 변수
	byte byteField;
	short shortField;
	
	boolean booleanField;
	char charField;
	
	float floatField;
	
	// 참조형 변수
	int[] arrField;
	String strField;
	
	// override 란 재참조 할 때 사용한다.
	// String 자료형을 참조하여 toString 이라는 매서드를 생성하였습니다.
	@Override
	public String toString() {
		
	  	// 각각의 맴버변수에 저장된 값들을 출력하고있습니다.
		String str = "byteField : " + byteField + "\nShortField : " + shortField + "\nbooleanField : " + booleanField + "\nCharField : " + charField + "\nFloatField : " + floatField + "\nArrField : " + arrField + "\nStrField : " + strFiled;
		return str; 
	}
}

// FieldInit_test 클래스
class FieldInit_test {
	
	// FieldInit 클래스를 참조
	public static void main(String[] args) {
		
		FieldInit fi = new FieldInit();
		System.out.println(fi.toString());
	}
}
