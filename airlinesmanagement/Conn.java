package airlinesmanagement;


import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///airlinesmanagement", "root", "password");
            s = c.createStatement();
            System.out.print("connection created");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main() {
    	System.out.print("connection created");
    }
}