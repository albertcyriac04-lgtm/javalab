import java.util.Scanner;

class Book {
    int bookid;
    String title;
    String author;

    public void setBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        bookid = sc.nextInt();
        System.out.print("Enter Title: ");
        title = sc.next();
        System.out.print("Enter Author: ");
        author = sc.next();
    }

    public int getBookid() {
        return bookid;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

public class BookUtility {
    public static void displayBook(Book book) {
        System.out.println("Book ID: " + book.getBookid());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.setBook();
        displayBook(b);
    }
}