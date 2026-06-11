package Day9.Crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
    public static void update() throws SQLException {
        Connection con = ConnnetionUtil.getDbConnection();
        
        if (con == null) {
            System.out.println("Failed to connect to the database.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No to edit: ");
        int rollNo = sc.nextInt();
        
        System.out.print("Enter New Name: ");
        String name = sc.next();
        
        System.out.print("Enter New Class: ");
        String studentClass = sc.next();

        String sqlUpdate = "update student set name=?, class=? where RollNo=?";
        
        
        try {
            PreparedStatement pstmt = con.prepareStatement(sqlUpdate);
            pstmt.setString(1, name);
            pstmt.setString(2, studentClass);
            pstmt.setInt(3, rollNo);

            pstmt.executeUpdate();
            con.close();
            
        }catch (SQLException e) {
            e.printStackTrace();
        }

            
    }
}