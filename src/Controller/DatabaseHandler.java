package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DatabaseHandler {
    public Connection con;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/tokobuku";
    private String username = "root";
    private String password = "";

    private Connection logOn(){
        try{
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getLocalizedMessage());
            JOptionPane.showMessageDialog(null, "Login gagal. Periksa email/password Anda." + ex);
        }
        return con;
    }

    private void logOff(){
        try{
            con.close();
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Login gagal. Periksa email/password Anda." + ex);
        }
    }

    public void connect(){
        try{
            con = logOn();
        } catch (Exception ex) {
            System.out.println("Error occured when connecting to database");
        }
    }

    public void discconnect(){
        try{
            logOff();
        } catch (Exception ex) {
            System.out.println("Error occured when connecting to database");
        }
    }
}
