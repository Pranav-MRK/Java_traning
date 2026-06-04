package Day3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pro odd= new Pro();
        // System.out.println("Enter your number to check wethere it is even or odd : ");
        // int v = sc.nextInt();
        // boolean n = odd.Odd_even(v);
        // System.out.println(n);

        System.out.println("Enter your number t1 : ");
        
        int t1 = sc.nextInt();
        System.out.println("Enter your number t2 : ");
        int t2 = sc.nextInt();

        int n = odd.Sum(t1, t2);
        System.out.println("Sum of your numbers is : " + n);





        // int arr[] ={1,2,3,4,5,6,7,8};
        // int k =4;

        // int p = odd.find_No(arr, k);
        // System.out.println("Found number at index at : "+p);

    }
}
