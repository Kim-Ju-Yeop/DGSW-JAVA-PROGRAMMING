package class04_29;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {

    private Date birthDate = new Date();
    private Date now = new Date();

    private final String birth = "2003년 11월 04일";

    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        myDate.setDate();
        System.out.println("당신이 태어나서부터 지금까지 약 : " + myDate.showSecond() + "밀리 세컨드 지났습니다.");
    }

    // 문자열 birth 변수의 값을 Date 클래스 형식에 맞게 구성한다.
    private void setDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
        try{ birthDate = simpleDateFormat.parse(birth);}
        catch (Exception e){e.printStackTrace();}
    }

    // Date 클래스의 현재 시간 now 변수와 Date 클래스 birthDate 변수의 값을 빼주며 반환한다.
    private long showSecond(){
        return now.getTime() - birthDate.getTime();
    }
}
