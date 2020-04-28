package Example;

public class ReturnStringBuilder {
    public static void main(String[] args) {

        // stringBuilder2 인스턴스를 stringBuilder1 의 인스턴스로 참조하고 있습니다.
        StringBuilder stringBuilder1 = new StringBuilder("1,2,3");
        StringBuilder stringBuilder2 = stringBuilder1.append(45678);

        System.out.println(stringBuilder1.toString());
        System.out.println(stringBuilder2.toString());

        stringBuilder2.delete(0, 5);

        System.out.println(stringBuilder1.toString());
        System.out.println(stringBuilder2.toString());

        // stringBuilder2 의 인스턴스는 stringBuilder1 의 인스턴스를 참조하고 있기 때문에 같은 인스턴스를 참조한다.
        // 즉 안에 들어있는 값 또한 동일한 값이 출력이 됩니다.
        if(stringBuilder1 == stringBuilder2){
            System.out.println("같은 인스턴스 참조");
        } else{
            System.out.println("다른 인스턴스 참조");
        }
    }
}
