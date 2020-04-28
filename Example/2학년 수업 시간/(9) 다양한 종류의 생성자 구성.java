package class04_28;

public class Book {

    private String title;
    private String content;
    private int price;

    // constructor
    public Book(){
        this("무제");
    }
    public Book(String title){
        setTitle(title);
    }

    // Getter & Setter
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Book javaBook = new Book("자바 책");
        System.out.println(javaBook.getTitle() + javaBook.getPrice());

        Book noBook = new Book();
        System.out.println(noBook.getTitle() + noBook.getPrice());
    }
}
