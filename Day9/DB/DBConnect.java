package Day9.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static void main(String[] args) {
        // 1. Define connection details
        // Replace 'your_database_name' with the actual name of your MySQL schema
        String url = "jdbc:mysql://localhost:3306/delta_app "; 
        String username = "root"; // Your MySQL username (usually root)
        String password = "pranav044"; // Your actual MySQL password

        System.out.println("Connecting to database...");

        // 2. Establish connection
        try (Connection connection = DriverManager.getConnection(url,username, password)) {
            System.out.println("Database connected successfully!" + connection);
            
        } catch (SQLException e) {
            System.out.println("Oops! Something went wrong with the connection.");
            e.printStackTrace();
        }
    }
}