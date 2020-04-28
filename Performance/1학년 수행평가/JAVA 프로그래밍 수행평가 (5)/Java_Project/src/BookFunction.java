import java.util.Scanner;

public class BookFunction {

    // Array
    Book[] books = new Book[120];
    int[] bookCount = new int[]{0, 0, 0, 0};

    // Variable
    static Scanner scanner = new Scanner(System.in);
    static int count = 0;


    User[] users = new User[10];
    int[] userLentCount = new int[]{0,0,0,0,0,0,0,0,0,0};

    // this() 예약어 사용
    BookFunction(String bookFunction){

    }

    BookFunction(){
        this("bookFunction");
    }


    public void addBook() {

        String bookName = getString("책 이름을 입력하세요(책 이름에 공백을 두지 마세요) : ");
        scanner.nextLine();

        System.out.println();
        int bookKindNumber = getInt("(0) 예술\n(1) 문학\n(2) 과학\n(3) 역사\n역사 분류 중 어떠한 분류의 책을 추가할 것인가요 : ");

        if (bookKindNumber == 0 || bookKindNumber == 1 || bookKindNumber == 2 || bookKindNumber == 3) {

            for(Book i : books){

                if(i == null){
                    break;
                }

                if(bookName.equals(i.getBookName())){
                    System.out.println();
                    System.out.println("이미 존재하는 책입니다.");
                    return;
                }
            }

            if (bookCount[bookKindNumber] > 30) {
                System.out.println("더 이상 책을 추가하실 수 없습니다.");
            } else {
                bookCount[bookKindNumber]++;
                books[count++] = new Book(bookKindNumber, bookName, bookCount[bookKindNumber]);
            }
        }
    }

    // showBookList
    public void showBookList() {

        int[] possible = new int[]{0, 0, 0, 0}; // 대출 가능 도서
        int[] impossible = new int[]{0, 0, 0, 0}; // 대출 불가능 도서

        for (Book i : books) {
            if (i == null)
                break;
            if (i.getStale()) {
                possible[i.getBookKindNumber()]++;
            } else {
                impossible[i.getBookKindNumber()]++;
            }
        }

        System.out.println();
        System.out.println("예술 관련 도서 | 대출 가능 도서 : [" + possible[0] + "]" + " | 대출 불가능 도서 : [" + impossible[0] + "]");
        System.out.println("문학 관련 도서 | 대출 가능 도서 : [" + possible[1] + "]" + " | 대출 불가능 도서 : [" + impossible[1] + "]");
        System.out.println("과학 관련 도서 | 대출 가능 도서 : [" + possible[2] + "]" + " | 대출 불가능 도서 : [" + impossible[2] + "]");
        System.out.println("역사 관련 도서 | 대출 가능 도서 : [" + possible[3] + "]" + " | 대출 불가능 도서 : [" + impossible[3] + "]");
    }

    // searchBook
    public void searchBook(){
        String bookName = getString("검색하고 싶으신 책을 입력하여주세요 : ");
        scanner.nextLine();

        for(Book i : books){
            if(i == null){
                break;
            }
            if(i.getBookName().equals(bookName)){
                System.out.println();
                System.out.println("입력하신 책이 존재합니다.");
                return;
            }
        }

        System.out.println();
        System.out.println("입력하신 책이 존재하지 않습니다.");
    }

    // lentBook
    public void lentBook(){
        int userNumber = getInt("회원 ID 인 0에서 9번 중 원하시는 것을 입력하여주세요 : ");
        String bookName = getString("대여하실 책의 이름을 입력하여주세요 : ");
        scanner.nextLine();

        for(Book i : books){
            if(i == null){
                break;
            }

            if(i.getBookName().equals(bookName)){

                if(userLentCount[userNumber] >= 3){
                    System.out.println();
                    System.out.println("한 명의 회원이 3개 이상의 도서를 대여하실 수 없습니다.");
                    return;
                } else if(i.getStale() != false){
                    i.setStale(false);
                    i.setReturnDate();
                    i.setMemberNumber(userNumber);
                    userLentCount[userNumber] += 1;

                    System.out.println();
                    System.out.println("입력하신 책을 대여하였습니다.");
                    System.out.println("대여 기간은 대여한 날짜로부터 " + i.getReturnDate().getYear() + "년 " + i.getReturnDate().getMonthValue() + "월 " + i.getReturnDate().getDayOfMonth() + "일까지 입니다.");
                    return;
                } else{

                    if(i.getMemberNumber() == users[userNumber].getMemberNumber()){
                        System.out.println();
                        System.out.println("이미 고객님께서 대여를 하였습니다.");
                    } else{
                        System.out.println();
                        System.out.println("입력하신 책은 현재 대여중입니다.");
                        System.out.println("입력하신 책의 예상 반납 날짜는 "+ i.getReturnDate().getYear() + "년 " + i.getReturnDate().getMonthValue() + "월 " + i.getReturnDate().getDayOfMonth() + "일 입니다.");
                    }
                    return;
                }
            }
        }

        System.out.println();
        System.out.println("입력하신 책이 존재하지 않습니다.");
    }

    public void showMyBook(){
        int userNumber = getInt("회원 ID 인 0에서 9번 중 원하시는 것을 입력하여주세요 : ");
        System.out.println();
        int check = 0;
        scanner.nextLine();

        for(Book i : books){

            if(i == null){
                break;
            }

            if(i.getMemberNumber() == users[userNumber].getMemberNumber()){
                System.out.println(users[userNumber].getName() + " | " + i.getBookName() + " | " + i.getReturnDate().getYear() + "년 " + i.getReturnDate().getMonthValue() + "월 " + i.getReturnDate().getDayOfMonth() + "일");
                check = 1;
            }
        }

        if(check == 0){
            System.out.println(users[userNumber].getName() + "님이 현재 대여한 책은 존재하지 않습니다.");
        }
    }

    public void makeUser(){
        users[0] = new User("김혜선", "010-1234-5678", "대구", 0);
        users[1] = new User("도지은", "010-1234-5678", "대구", 1);
        users[2] = new User("오하형", "010-1234-5678", "대구", 2);
        users[3] = new User("이지수", "010-1234-5678", "대구", 3);
        users[4] = new User("강민석", "010-1234-5678", "봉화", 4);
        users[5] = new User("권용빈", "010-1234-5678", "대구", 5);
        users[6] = new User("김경재", "010-1234-5678", "대구", 6);
        users[7] = new User("김도현", "010-1234-5678", "대구", 7);
        users[8] = new User("김문모", "010-1234-5678", "대구", 8);
        users[9] = new User("김주엽", "010-6392-7114", "대구", 9);
    }


    // 사용자로부터 String 문자열을 입력받아 Return
    public String getString(String message) {
        System.out.print(message);
        return scanner.next();
    }

    // 사용자로부터 Int 정수형을 입력받아 Return
    public int getInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }
}
