package Day2;

import java.util.Scanner;

public class Shop {
    public static void main(String args[]){
        
        System.out.println("1:Bag - $10 , 2:Bottel - $5  ,3:Pen - $1 ,4:Charger - $50 ,6:exit");
        Scanner sc = new Scanner(System.in);
        int totalCost =0;
        int ch =0;
        int Amount =0;
        int Quant =0;


      

        do {
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the Quant: ");
                    Quant = sc.nextInt();
                    Amount =10;
                    totalCost += Quant * Amount;
                    break;
                case 2:
                    System.out.println("Enter the Quant: ");
                    Quant = sc.nextInt();
                    Amount =5;
                    totalCost += Quant * Amount;
                    break;

                case 3:
                    System.out.println("Enter the Quant: ");
                    Quant = sc.nextInt();
                    Amount =1;
                    totalCost += Quant * Amount;
                    break;
                case 4:
                    System.out.println("Enter the Quant: ");
                    Quant = sc.nextInt();
                    Amount =50;
                    totalCost += Quant * Amount;
                    break;
            
                default:
                    break;
            }
            
        } while (ch!=6);    
        
        System.out.println("Total Amount to Pay : " + totalCost);
        System.out.println("********************* Thanks for Visiting **********************");
    }
}
