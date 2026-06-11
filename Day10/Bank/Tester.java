package Day10.Bank;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class Tester {
    public static void main(String[] args) throws SQLException {
        Connection con = ConnectionUtil.getDbConnection();

        try {
            con.setAutoCommit(false);

            String str1 = "INSERT INTO BankAccount VALUES (209, cssdc, ghj, nns, 4000)";
            String str2 = "INSERT INTO BankAccount VALUES (210, cssdc1, ghj1, nns1, 5000)";

            Statement stmt = (Statement) con.createStatement();

            int i = stmt.executeUpdate(str1);
            System.out.println("1 act" + i);
            stmt.executeUpdate(str1);
            System.out.println("1 cust inserted");

            stmt.executeUpdate(str2);
            System.out.println("1 cust inserted");

            con.commit();
            System.out.println("-------comit-----");

        } catch (Exception e) {
            System.out.println("transaction Rollback");
            con.rollback();
            e.printStackTrace();
        }


            
    
    }
}
