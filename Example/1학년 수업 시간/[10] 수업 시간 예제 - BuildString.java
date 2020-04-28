package Example;

public class BuildString {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("1,2,3");

        // append 함수 : 문자열 덧붙이기
        stringBuilder.append(45678);
        System.out.println(stringBuilder.toString());

        // delete 함수 : 문자열 일부 자르기
        stringBuilder.delete(0, 2);
        System.out.println(stringBuilder.toString());

        // replace 함수 : 문자열 일부 교체
        stringBuilder.replace(0, 3, "AB");
        System.out.println(stringBuilder.toString());

        // reverse 함수 : 문자열 내용 뒤집기
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());

        // substring 함수 : 문자열 일부 변환
        String sub = stringBuilder.substring(2, 4);
        System.out.println(sub);
    }
}
