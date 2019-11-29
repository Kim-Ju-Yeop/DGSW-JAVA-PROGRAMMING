import java.time.LocalDateTime;

public class Book extends BookMember {

    private int bookNumber;
    private int bookKindNumber;
    private String bookName;
    private boolean stale;
    private LocalDateTime returnDate;

    public Book(int bookKindNumber, String bookName, int count) {
        super(10);
        setBookKindNumber(bookKindNumber);
        setBookNumber(bookKindNumber, count);
        setBookName(bookName);
        setStale(true);
    }

    public int getBookKindNumber() {
        return bookKindNumber;
    }

    public boolean getStale(){
        return stale;
    }

    @Override
    public int getMemberNumber() {
        return super.getMemberNumber();
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    @Override
    public void setMemberNumber(int memberNumber) {
        super.setMemberNumber(memberNumber);
    }

    public void setBookKindNumber(int bookKindNumber) {
        this.bookKindNumber = bookKindNumber;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookNumber(int bookKindNumber, int count) {
        if(bookKindNumber == 0) {
            this.bookNumber = count + 0000;
        }
        else if(bookKindNumber == 1) {
            this.bookNumber = count + 1000;
        }
        else if(bookKindNumber == 2) {
            this.bookNumber = count + 2000;
        }
        else {
            this.bookNumber = count + 3000;
        }
    }

    public void setStale(boolean stale) {
        this.stale = stale;
    }

    public void setReturnDate() {

        LocalDateTime currentDateTime = LocalDateTime.now();
        this.returnDate = currentDateTime.plusDays(7);
    }
}
