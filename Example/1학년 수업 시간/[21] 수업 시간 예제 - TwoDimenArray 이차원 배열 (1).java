package Ex_Array;

public class TwoDimenArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int num = 1;

        // arr 배열에 값 저장
        for(int height = 0; height < 3; height++){
            for(int width = 0; width < 4; width++){
                arr[height][width] = num;
                num++;
            }
        }

        // arr 배열 값 출력
        for(int height = 0; height < 3; height++){
            for(int width = 0; width < 4; width++){
                System.out.print(arr[height][width] + "\t");
            }
            System.out.println();
        }
    }
}
