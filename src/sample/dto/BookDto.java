package sample.dto;

public class BookDto {
    private String bookId;
    private String bookName;
    private String author;
    private int total;
    private int remain;

    public BookDto() {
    }

    public BookDto(String bookId, String bookName, String author, int total, int remain) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.total = total;
        this.remain = remain;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getRemain() {
        return remain;
    }

    public void setRemain(int remain) {
        this.remain = remain;
    }

}
