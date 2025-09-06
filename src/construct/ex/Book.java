package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목: "+title+", 작가: "+author+", 페이지 수: "+page);
    }
}
