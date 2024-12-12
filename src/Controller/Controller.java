package Controller;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import Model.*;

public class Controller {
    public static boolean createBuku(int bookID, String judul, String author, String genre, String price){
        Books book = new Books(0, judul, author, genre, price);
        if (bookID == 1){
            DBController.insertNewBooks(book);
        }
    }
}
