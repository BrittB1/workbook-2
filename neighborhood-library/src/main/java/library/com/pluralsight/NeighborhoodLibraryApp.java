package library.com.pluralsight;

import java.awt.print.Book;

public class NeighborhoodLibraryApp {
    public static void main(String[] args) {
        Book b, bi;  //book doesn't exist. it holds the book in memory as a reference




                b = new Book("Book Title,22");
                b1 = new Book("Book number 2");
                System.out.println(b.getTitle());

                b.setTitle("Book Title 2");
    }
}
