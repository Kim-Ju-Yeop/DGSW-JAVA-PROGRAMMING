package Ex_Array;

class Box{

    // 맴버변수
    private String contents;
    private int boxNum;

    // Box 매개변수 생성자
    Box(int num, String cont){
        boxNum = num;
        contents = cont;
    }

    public int getBoxNum(){
        return boxNum;
    }
    public String toString(){
        return contents;
    }
}

public class EnhancedForInst {
    public static void main(String[] args) {

        // Box 클래스를 참조하여 arr 배열을 생성하였다.
        Box[] arr = new Box[5];

        arr[0] = new Box(101, "Coffee");
        arr[1] = new Box(202, "Computer");
        arr[2] = new Box(303, "Apple");
        arr[3] = new Box(404, "Dress");
        arr[4] = new Box(505, "Fairy-tale book");

        // Box 클래스의 맴버변수 505 값을 가진 값만 출력한다.
        for(Box e : arr){
            if(e.getBoxNum() == 505){
                System.out.println(e);
            }
        }
    }
}
