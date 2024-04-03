import Model.Book;
import View.BookView;
import Controller.BookController;
import additionalView.Swing;
import java.util.Scanner;

public class BookShop {
    public static void main(String[] args) {
        // Створення екземпляру книги
        Book book = new Book("Kobzar", "Taras Shevchenko", 51);

        // Створення екземпляру представлення книги
        BookView view = new BookView();

        // Створення екземпляру контролера книги
        BookController controller = new BookController(book, view);

        // Створення GUI для відображення деталей книги та забезпечення оновлень
        Swing gui = new Swing(controller);

        // Відображення початкових деталей книги
        controller.updateView();

        // Зчитування нових деталей книги з клавіатури
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new title:");
        String newTitle = scanner.nextLine();
        System.out.println("Enter new author:");
        String newAuthor = scanner.nextLine();
        System.out.println("Enter new price:");
        double newPrice = scanner.nextDouble();

        // Оновлення деталей книги та відображення оновлених деталей
        controller.setBookTitle(newTitle);
        controller.setBookAuthor(newAuthor);
        controller.setBookPrice(newPrice);
        controller.updateView();
    }
}
