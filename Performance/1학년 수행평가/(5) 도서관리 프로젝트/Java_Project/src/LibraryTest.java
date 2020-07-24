public class LibraryTest {

    public static void run(){
        SelectList selectList = new SelectList();
        selectList.showList();
    }

    public static void main(String[] args) {
        start();
        run();
    }

    public static void start(){
        UserFunction userFunction = new UserFunction();
        userFunction.hello("안녕하세요");
        userFunction.introduce(" Java 도서관입니다.");
        userFunction.explain("저희 도서관은 사람들에게 행복을 주기 위해 무료로 운영되고 있습니다.");
    }

    public void hello(){ }
    public void introduce(){ }
    public void explain(){ }
}
