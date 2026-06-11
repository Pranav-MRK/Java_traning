package Day9.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestInsert {
    public static void Insert() {
        Connection con = ConnnetionUtil.getDbConnection();

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        
        System.out.print("Enter Name: ");
        String name = sc.next();
        
        System.out.print("Enter Class: ");
        String studentClass = sc.next(); // Changed 'Class' to 'studentClass'

        String sqlIn = "insert into student values(?,?,?)";

        try {
            PreparedStatement pstmt = con.prepareStatement(sqlIn); 

            pstmt.setInt(1, rollNo);
            pstmt.setString(2, name);
            pstmt.setString(3, studentClass);

            // Execute the insert statement
            int rowsInserted = pstmt.executeUpdate();
            
            if (rowsInserted > 0) {
                System.out.println("Student record inserted successfully into MySQL!");
            }
            
            // Clean up resources
            pstmt.close();
            con.close();
            sc.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
