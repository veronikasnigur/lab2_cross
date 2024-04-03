package additionalView;
import Controller.BookController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing extends JFrame {
    private JLabel titleLabel, authorLabel, priceLabel;
    private JTextField titleField, authorField, priceField;
    private JButton updateButton;
    private BookController controller;

    public Swing(BookController controller) {
        this.controller = controller;
        setTitle("Book Details");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
        setLayout(new GridLayout(4, 2));

        add(titleLabel);
        add(titleField);
        add(authorLabel);
        add(authorField);
        add(priceLabel);
        add(priceField);
        add(new JLabel()); // Placeholder for spacing
        add(updateButton);

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String author = authorField.getText();
                double price = Double.parseDouble(priceField.getText());

                controller.setBookTitle(title);
                controller.setBookAuthor(author);
                controller.setBookPrice(price);
                controller.updateView();
            }
        });

        setVisible(true);
    }

    private void initComponents() {
        titleLabel = new JLabel("Title:");
        authorLabel = new JLabel("Author:");
        priceLabel = new JLabel("Price:");

        titleField = new JTextField(controller.getBookTitle());
        authorField = new JTextField(controller.getBookAuthor());
        priceField = new JTextField(String.valueOf(controller.getBookPrice()));

        updateButton = new JButton("Update");
    }
}
