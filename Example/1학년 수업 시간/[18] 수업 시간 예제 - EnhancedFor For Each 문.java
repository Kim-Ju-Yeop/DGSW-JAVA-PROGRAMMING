package Ex_Array;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;

        // arr 배열 요소의 값을 For Each 문을 사용하여 출력
        for(int e : arr){
            System.out.print(e + "");
        }

        System.out.println();

        // arr 배열 요소의 값을 sum 변수에 모두 저장
        for(int e : arr){
            sum += e;
        }

        System.out.println("sum : " + sum );
    }
}
