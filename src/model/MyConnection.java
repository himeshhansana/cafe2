package model;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class MyConnection {

    public static final String username = "root";
    public static final String password = "ncbes7154hansana12H";
    public static final String url = "jdbc:mysql://localhost:3306/cafe2";
    public static Connection con = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "" + ex, "", JOptionPane.WARNING_MESSAGE);
        }
        return con;
    }
}
