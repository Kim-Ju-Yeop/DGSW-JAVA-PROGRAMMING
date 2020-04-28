package Ex_Array;

public class PartiallyFilledArray {
    public static void main(String[] args) {
        int[][] arr = {{11}, {22, 33}, {44, 55, 66}};

        // arr 배열에 값을 저장하고 있다.
        for(int height = 0; height < arr.length; height++){
            for(int width = 0; width < arr[height].length; width++){
                System.out.print(arr[height][width] + "\t");
            }
            System.out.println();
        }
    }
}
