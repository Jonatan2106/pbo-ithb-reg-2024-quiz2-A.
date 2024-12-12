package Controller;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model.*;

public class DBController {
    static DatabaseHandler conn = new DatabaseHandler();

    public static Books getLogin(String username, String password){
        Books book = new Books();
        try {
            conn.connect();
            String query = "SELECT * FROM users WHERE nama='" + username + "', passwordd='" + password + "'";
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
        
            if (rs.next()) {
                do{
                    book.setTitle(rs.getString("title"));
                    book.setAuthor(rs.getString("author"));
                    book.setGenre(rs.getString("genre"));
                    book.setPrice(rs.getString("price"));
                } while (rs.next());

            } 
            else {

                return null;

            } 

        }
        catch (SQLException e){
            e.printStackTrace();
        }
    
        conn.discconnect();
        return book;
    }

    public static boolean insertNewBooks(Books bookID){
        String query = "INSERT INTO books (booksID, title, author, genre, price) VALUES (?, ?, ?, ?, ?)"; 
        try {
            conn.connect();

            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setInt(1, bookID.getBooksID());
            stmt.setString(2, bookID.getTitle());
            stmt.setString(3, bookID.getAuthor());
            stmt.setString(3, bookID.getGenre());
            stmt.setString(3, bookID.getPrice());
        
            stmt.executeUpdate();
            return true;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        } 
        finally {
            conn.discconnect();
        }
    }
}
