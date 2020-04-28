package class04_28;

import java.util.ArrayList;
import java.util.Comparator;

public class ListStudy {
    public static void main(String[] args) {

        // Array
        String[] array = new String[10];
        array[0] = "양동현";
        array[1] = "권용빈";
        array[2] = "이지수";

        System.out.println("array[0] : " + array[0]);
        System.out.println("array[1] : " + array[1]);
        System.out.println("array[2] : " + array[2]);
        System.out.println("배열의 크기 : " + array.length);
        array[1] = null;
        System.out.println();

        // ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("양동현");
        list.add("권용빈");
        list.add("이지수");

        System.out.println("list[0] : " + list.get(0));
        System.out.println("list[1] : " + list.get(1));
        System.out.println("list[2] : " + list.get(2));
        System.out.println("리스트의 크기 : " + list.size());
        System.out.println();

        System.out.println("포함 여부 : " + list.contains("양동현")); // 반환 값 : true || false
        System.out.println("인덱스 : " + list.indexOf("권용빈")); // 반환 값 : 인덱스 값 || -1
        System.out.println();

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("정렬 후");
        for(String i : list) System.out.println(i);

        list.remove(0); // 0번째 인덱스 값 삭제
        list.remove("권용빈"); // 배열 속 권용빈 인덱스 삭제
    }
}
