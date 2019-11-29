import java.util.Scanner;

public class SelectList {

    // Scanner
    static Scanner scanner = new Scanner(System.in);

    // BookFunction Class
    BookFunction bookFunction = new BookFunction();

    // Choose List 출력
    public void showList(){

        bookFunction.makeUser();

        int input = 1;

        while(input != 0) {

            System.out.println();
            System.out.println("[1] 도서 목록보기");
            System.out.println("[2] 도서 검색하기");
            System.out.println("[3] 도서 대출하기");
            System.out.println("[4] 도서 반납하기");
            System.out.println("[5] 도서 추가하기");
            System.out.println("[6] 자신의 도서 대출 현황 보기");
            System.out.println("[0] 종료하기");

            System.out.println();
            System.out.print("위의 기능중 해당하는 번호를 입력해주세요 : ");

            input = scanner.nextInt();

            switch (input) {
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                case 1:
                    bookFunction.showBookList();
                    break;
                case 2:
                    bookFunction.searchBook();
                    break;
                case 3:
                    bookFunction.lentBook();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("도서 반납 기능은 준비중입니다. 나중에 찾아주세요 (수행평가 기능중 X)");
                    break;
                case 5:
                    bookFunction.addBook();
                    break;
                case 6:
                    bookFunction.showMyBook();
                    break;
                default:
                    break;
            }
        }
   }
}
