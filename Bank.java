import java.util.Scanner;

public class Bank {
    public static void main(String args[]){
        System.out.println("1:Create Account");
        System.out.println("2:Account details");
        System.out.println("3:Edit");
        System.out.println("4:Withdraw");
        System.out.println("5:Deposite");
        System.out.println("6:Check Balance");
        System.out.println("7:Delete Account");
        System.out.println("8:Exit");

        int ch;
        Scanner sc = new Scanner(System.in);
        
        int day = 0;
        int month = 0;
        int year = 0;
        String name = "";
        String city = "";
        String email = "";
        double Balance =0;
        double Withdraw =0;
        double Amount =0;
        long contact = 0;
        
        do {
            System.out.println("Enter your Choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Create");
                    System.out.println("Enter name:");  
                    name = sc.next();
                    System.out.println("Enter City:");  
                    city= sc.next();
                    System.out.println("Enter email:");  
                    email = sc.next();
                    System.out.println("Enter Balance:");  
                    Balance = sc.nextDouble();
                    System.out.println("Enter Contact:");  
                    contact=sc.nextLong();
                    System.out.println("Enter DOB");
                    day = sc.nextInt();
                    month = sc.nextInt();
                    year = sc.nextInt();

                    break;
                case 2:
                    System.out.println("********************Account details******************");  
                    System.out.println(name);  
                    System.out.println(city);  
                    System.out.println(email);  
                    System.out.println(Balance);  
                    System.out.println(contact);  
                    System.out.println(day+"/"+month+"/"+year);
                case 3:
                    System.out.println("*****Update detail********");
                    System.out.println("Enter new data");
                    System.out.println("Enter name:");  
                    name = sc.next();
                    System.out.println("city:");
                    city= sc.next();  
                    System.out.println("email:");  
                    email = sc.next();
                    System.out.println("Balance:");  
                    Balance = sc.nextDouble();
                    System.out.println("contact:");  
                    contact=sc.nextLong();
                    System.out.println("day:");
                    day = sc.nextInt();
                    System.out.println("Month:");
                    month = sc.nextInt();
                    System.out.println("Year:");
                    year = sc.nextInt();
                    
                    System.out.println("Details updated!");
                
                case 4:
                    System.out.println("*********Withdraw System ******************");
                    System.out.println("Enter Amount to Withdraw :");
                    Withdraw = sc.nextDouble();
                    if (Balance < Withdraw) {
                        System.out.println("You dont have money");
                    }else{
                        System.out.println("Withdraw Sccussefully !!!!");
                        Double updated_Balance = Balance-Withdraw;
                        System.out.println("Avalable Balance : "+ updated_Balance);
                    }
                case 5:
                    System.out.println("********* Add Money System ******************");
                    System.out.println("Enter Amount to to Add :");
                    Amount = sc.nextDouble();
                    if (Amount < 0) {
                        System.out.println("Invalid");
                    }else{
                        System.out.println("Deposite Sccussefully !!!!");
                        Double updated_Balance = Balance+Amount;
                        System.out.println("Avalable Balance : "+ updated_Balance);
                    }
                case 6:
                    System.out.println("Your current Balance is: "+ Balance);    
                
                case 8:
                    System.out.println("*********************************");
                    System.out.println("Thank You To Use Our Bank !!!!");    
                default:
                    break;
            }
        } while (ch!=8);

    
    }
}
