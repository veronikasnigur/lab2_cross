package Controller;
import Model.Book;
import View.BookView;

public class BookController {
    private Book model;
    private BookView view;

    public BookController(Book model, BookView view) {
        this.model = model;
        this.view = view;
    }

    // Методи для взаємодії з моделлю
    public String getBookTitle() { return model.getTitle(); }
    public void setBookTitle(String title) { model.setTitle(title); }
    public String getBookAuthor() { return model.getAuthor(); }
    public void setBookAuthor(String author) { model.setAuthor(author); }
    public double getBookPrice() { return model.getPrice(); }
    public void setBookPrice(double price) { model.setPrice(price); }

    // Метод для оновлення представлення
    public void updateView() {
        view.printBookDetails(model.getTitle(), model.getAuthor(), model.getPrice());
    }
}
