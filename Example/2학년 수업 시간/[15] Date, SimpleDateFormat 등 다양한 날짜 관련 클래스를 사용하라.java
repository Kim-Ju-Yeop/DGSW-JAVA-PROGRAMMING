package class04_29;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateStudy {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        // Date Type 형태의 값을 특정 문자열 형태로 변환한다. (format 사용)
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(now));

        // 문자열 형태의 값을 Date Type 형태의 값으로 변환한다. (parse 사용)
        try {
            String sTime = "2020-04-29 15:33:08";
            Date time1 = dateFormat.parse(sTime);
            System.out.println(time1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Calendar 클래스를 사용해서 다양한 시간 관련 내용들을 참조할 수 있다.
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        System.out.println("년 : " + calendar.get(Calendar.YEAR));
        System.out.println("월 : " + calendar.get(Calendar.MONTH));
        System.out.println("일 : " + calendar.get(Calendar.DATE));

    }
}
