package Example;

public class StringInst {

    // String 문자열을 매개변수로 입력 받아 문자열과 길이를 출력하는 showString 매서드
    public static void showString(String str){
        System.out.println(str);
        System.out.println(str.length());
    }
}

class StringInst_test{

    public static void main(String[] args) {

        // String 클래스를 참조해서는 new 예약어 또는 문자열로 값을 대입하여도 결과는 동일하다.
        String str1 = new String("Simple String");
        String str2 = "The Best String";

        System.out.println(str1);
        System.out.println(str1.length());

        System.out.println();

        System.out.println(str2);
        System.out.println(str2.length());

        System.out.println();

        StringInst.showString("Funny String");
    }
}

class StringEqualsEx{
    public static void main(String[] args) {

        String str1 = "대구소프트웨어고";
        String str2 = "대구소프트웨어고";

        // str1, str2 변수에는 문자열의 값을 대입하였지만 str3 변수에는 String 클래스를 참조해서 str3 인스턴스를 생성하면서 매개변수로 값을 전달하고있습니다.
        String str3 = new String("대구소프트웨어고등학교");

        boolean result = (str1 == str2);
        System.out.println(result);

        // new 예약어를 사용해서 생성한 str3 의 값은 str1 과 str2 의 값과는 값이 같지만 주소가 다르기 때문에 false 로 출력이 됩니다.
        boolean result1 = (str1 == str3);
        System.out.println(result1);
    }
}
