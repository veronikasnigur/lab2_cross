package View;

public class BookView {
    public void printBookDetails(String title, String author, double price){
        System.out.println("Book: ");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}
