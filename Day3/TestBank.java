package Day3;

import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {
        Bank acc1 = new Bank();
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the option 1:Create,2:CheckBalance,3:Deposite,4:Credit,5:See Profile");
        int option;
        
        do {
            option = sc.nextInt();
            
            switch (option) {
                case 1:
                    acc1.addDetails(04, 1000000, "Mr.Marcob","Mr@gmail.com");
                    break;
                case 2:
                    acc1.Balance();
                    
                    break;
                    
                case 3:
                    acc1.deposite(10);
                    
                    break;
                case 4:
                    
                    acc1.credit(1000000);
                    
                    break;   
                    
                case 5:
                    acc1.showAccountHolder();

                    break;    
                default:
                    break;
            }
        } while (option!=6);
        


        

    }
}
