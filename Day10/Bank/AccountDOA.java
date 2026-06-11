package Day10.Bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDOA {
    private Connection con;
    public AccountDOA(){
        con = ConnectionUtil.getDbConnection();
    }
    ArrayList<Account> allAct = new ArrayList<>();

    public ArrayList<Account> getAllAcc() throws SQLException{
        String sql ="SELECT * FROM BankAccount;";
        // static type so using Statement
        Statement stmt = con.createStatement();
        ResultSet rset = stmt.executeQuery(sql);
        ArrayList<Account> allAct = new ArrayList<>();

        while (rset.next()) {
            int accID = rset.getInt("AccID");
            String name = rset.getString("name");
            String email = rset.getString("email");
            String pwd = rset.getString("pwd");
            double balance = rset.getDouble("balance");

            allAct.add(new Account(accID, name, email, pwd, balance));
        }

        return allAct;
    }


    public int createAcc(Account acc) throws SQLException {
        String sql = "INSERT INTO BankAccount (AccID, name, email, pwd, balance) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, acc.getAccID());
        ps.setString(2, acc.getName());
        ps.setString(3, acc.getEmail());
        ps.setString(4, acc.getPwd());
        ps.setDouble(5, acc.getBalance());
        int rowsInserted = ps.executeUpdate();
       
        return rowsInserted;
    }

    public int updateAcc(Account acc) throws SQLException {
        String sql = "UPDATE BankAccount SET name = ?, email = ?, pwd = ?, balance = ? WHERE AccID = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, acc.getName());
        ps.setString(2, acc.getEmail());
        ps.setString(3, acc.getPwd());
        ps.setDouble(4, acc.getBalance());
        ps.setInt(5, acc.getAccID());
        int rowsUdated = ps.executeUpdate();
        return rowsUdated;
        
    }

    public int deleteAcc(int accID) throws SQLException {
        String sql = "DELETE FROM BankAccount WHERE AccID = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, accID);
        return ps.executeUpdate();
        
    }


    public Account login(String email,String pwd) throws SQLException{
        System.out.println("inside Login" + email +" " +pwd);
        String sql = "select * from BankAccount Where Email=? and Pwd=?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, email);
        ps.setString(2, pwd);

        ResultSet rSet = ps.executeQuery();
        if (rSet.next()) {
            System.out.println("Valid Login Credentials");
            int accID = rSet.getInt("AccID");
            String name = rSet.getString("name");
            String emailStr = rSet.getString("email");
            String pwdStr = rSet.getString("pwd");
            double balance = rSet.getDouble("balance");
           return new Account(accID, name, emailStr, pwdStr, balance);
        } else {
            System.out.println("Invalid Login Credentials");
            return null;
        }
    }

    public void withdraw(Account act ,double amount) throws SQLException{
        String update = "update BankAccount set balance=? where actid=?";

        double cBalance =act.getBalance();
        double upBalance = cBalance - amount;

        PreparedStatement ps = con.prepareStatement(update);

        ps.setDouble(1, upBalance);
        ps.setInt(2, act.getAccID());

        int i = ps.executeUpdate();
        if (i>0) {
            System.out.println("Withdraw done....");
        }
    }

    public void Deposist(Account act ,double amount) throws SQLException{
        String update = "update BankAccount set balance=? where actid=?";

        double cBalance =act.getBalance();
        double upBalance = cBalance + amount;

        PreparedStatement ps = con.prepareStatement(update);

        ps.setDouble(1, upBalance);
        ps.setInt(2, act.getAccID());

        int i = ps.executeUpdate();
        if (i>0) {
            System.out.println("Deposite done....");
        }
    }

    public void Transcation(Account senderAcc, Account receiverAcc, double amount) throws SQLException {
        try {
            con.setAutoCommit(false);
            
            String senderSQL = "UPDATE BankAccount SET balance = ? WHERE AccID = ?";
            String receiverSQL = "UPDATE BankAccount SET balance = ? WHERE AccID = ?";
            
            // Sender: deduct amount
            double senderBalance = senderAcc.getBalance() - amount;
            PreparedStatement senderStmt = con.prepareStatement(senderSQL);
            senderStmt.setDouble(1, senderBalance);
            senderStmt.setInt(2, senderAcc.getAccID());
            int senderResult = senderStmt.executeUpdate();
            if (senderResult > 0) {
                System.out.println("Sender balance deducted: " + amount);
                senderAcc.setBalance(senderBalance);
            }
            
            // Receiver: add amount
            double receiverBalance = receiverAcc.getBalance() + amount;
            try{
                PreparedStatement receiverStmt = con.prepareStatement(receiverSQL);
                receiverStmt.setDouble(1, receiverBalance);
                receiverStmt.setInt(2, receiverAcc.getAccID());
                int receiverResult = receiverStmt.executeUpdate();
                if (receiverResult > 0) {
                    System.out.println("Receiver balance credited: " + amount);
                    receiverAcc.setBalance(receiverBalance);
                }
            }catch(SQLException e){
                con.commit();
                System.out.println("Transaction completed successfully!");
            }
            
            
            
        } catch (SQLException e) {
            con.rollback();
            System.out.println("Transaction failed. Rolled back: " + e.getMessage());
            throw e;
        } 
    }

}

