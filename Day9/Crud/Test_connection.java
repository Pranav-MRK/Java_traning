package Day9.Crud;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test_connection {
    public static void Show() {
        try {
            Connection con = ConnnetionUtil.getDbConnection();
            String sql ="SELECT * FROM Student;";
            Statement stmt=con.createStatement();
            
            ResultSet rSet=stmt.executeQuery(sql);

            while (rSet.next()) {
                System.out.println(rSet.getInt("RollNo") + " " + rSet.getString("Name")+" "+rSet.getString("Class"));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
    }
}
