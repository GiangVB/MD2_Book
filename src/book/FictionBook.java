package book;

public class FictionBook extends Book{
    private String category;

    public FictionBook() {
    }

    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(String bookCode, String name, int price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
