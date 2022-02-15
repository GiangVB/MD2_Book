import book.Book;
import book.FictionBook;
import book.ProgrammingBook;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new ProgrammingBook("P001","Basic", 110000, "Author One" , "Java", "React Native");
        books[1] = new ProgrammingBook();
        books[2] = new ProgrammingBook();
        books[3] = new ProgrammingBook();
        books[4] = new ProgrammingBook();
        books[5] = new FictionBook();
        books[6] = new FictionBook();
        books[7] = new FictionBook();
        books[8] = new FictionBook();
        books[9] = new FictionBook();
    }
}
