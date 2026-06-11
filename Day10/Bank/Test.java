package Day10.Bank;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        AccountDOA dao = new AccountDOA();

        Account loggedInUser = null;

        int ch;




        do {
            System.out.println("Select the Option: 1: See table  2: Insert  3: Update  4: Delete  5: Login 6:exit");
            ch = sc.nextInt();
            sc.nextLine(); 

            try {
                switch (ch) {
                    case 1:
                        List<Account> accounts = dao.getAllAcc();
                        if (accounts.isEmpty()) {
                            System.out.println("No accounts found.");
                        } else {
                            for (Account account : accounts) {
                                System.out.println(account);
                            }
                        }
                        break;
                    case 2:
                        System.out.print("Enter account ID: ");
                        int newId = sc.nextInt();
                        sc.nextLine(); // FIX: Clear newline after nextInt()
       
                        System.out.print("Enter Name: ");
                        String newName = sc.nextLine();
       
                        System.out.print("Enter Email: ");
                        String newEmail = sc.nextLine();
                  
                        System.out.print("Enter Password: ");
                        String newPwd = sc.nextLine();
               
                        System.out.print("Enter Balance: ");
                        double newBalance = sc.nextDouble();
                        sc.nextLine(); // FIX: Clear newline after nextDouble()
            
                        Account newAccount = new Account(newId, newName, newEmail, newPwd, newBalance);
                        int inserted = dao.createAcc(newAccount);
                        System.out.println(inserted + " row(s) inserted.");
                        break;

                    case 3:
                        
                        System.out.print("Enter account ID to update: ");
                        int updateId = sc.nextInt();
                        sc.nextLine(); // FIX: Clear newline after nextInt()

                        System.out.print("Enter Update Name: ");
                        String updateName = sc.nextLine();

                        System.out.print("Enter Update Email: ");
                        String updateEmail = sc.nextLine();

                        System.out.print("Enter Update Password: ");
                        String updatePwd = sc.nextLine();

                        System.out.print("Enter Update Balance: ");
                        double updateBalance = sc.nextDouble();
                        sc.nextLine(); // FIX: Clear newline after nextDouble()

                        Account updateAccount = new Account(updateId, updateName, updateEmail, updatePwd, updateBalance);
                        int updated = dao.updateAcc(updateAccount);
                        System.out.println(updated + " row(s) updated.");
                        break;
                    case 4:
                        System.out.print("Enter account ID to delete: ");
                        int deleteId = sc.nextInt();
                        
                        
                        int deleted = dao.deleteAcc(deleteId);
                        System.out.println(deleted + " row(s) deleted.");
                        break;
                    case 5:
                        System.out.println("First Login Required......");
                        System.out.print("Enter Email: ");
                        String loginEmail = sc.nextLine();
                        System.out.print("Enter Password: ");
                        String loginPwd = sc.nextLine();
                        loggedInUser = dao.login(loginEmail, loginPwd);
                        
                        if (loggedInUser != null) {
                            System.out.println("Logged in succusefully.....");
                            System.out.println(loggedInUser);
                            return;
                        }
                        
                        break;
                    default:

                        break;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } while (ch != 6);

        sc.close();
    }
}
