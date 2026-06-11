package Day9.Crud;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("Select the Option: 1: See table  2: Insert  3: Update  4: Delete  5: Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Test_connection.Show();
                    break;
                case 2:
                    TestInsert.Insert();
                    break;
                case 3:
                    Update.update();
                    break;
                case 4:
                    Remove.Delete();
                    break;
                case 5:
                    System.out.println("Thank you for using");
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1-5.");
                    break;
            }

        } while (ch != 5);
    }
}
