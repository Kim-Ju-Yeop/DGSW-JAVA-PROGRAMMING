package Ex_Array;

public class TwoDimenArray2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int num = 1;

        // arr 배열에 값 저장
        // arr.length 는 현재 arr 배열의 길이를 구한다.
        for(int height = 0; height < arr.length; height++){
            for(int width = 0; width < arr[height].length; width++){
                arr[height][width] = num;
                num++;
            }
        }

        // arr 배열에 값 출력
        for(int height = 0; height < arr.length; height++){
            for(int width = 0; width < arr[height].length; width++){
                System.out.print(arr[height][width] + "\t");
            }
            System.out.println();
        }
    }
}
