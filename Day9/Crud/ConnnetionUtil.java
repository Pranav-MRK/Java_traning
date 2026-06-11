package Day9.Crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnnetionUtil {
    public static Connection getDbConnection(){
        try {
            // Make sure you replace this with your actual database name, user, and password strings!
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MIT", "root", "pranav044");
            
            return con;
            
        } catch (SQLException e) {
            System.out.println("Oops! Something went wrong with the connection.");
            e.printStackTrace();
        }
        
        return null; // <-- FIX: This ensures the method always returns a value
    }
}