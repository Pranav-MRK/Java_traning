package Day2;

import java.util.Scanner;

public class arr {
    // public static void main(String[] args) {
    //     int[] nums = new int[5];
    //     Scanner sc = new Scanner(System.in);
    //     int sum =0;

    //     for (int i = 0; i < nums.length; i++) {
    //         System.out.print("Enter your number:");
    //         nums[i] = sc.nextInt();
    //     }
    //     for (int i = 0; i < nums.length; i++) {
    //         // sum+= nums[i];
    //         if (nums[i] %2 ==0) {
    //             sum+= nums[i];
    //         }

    //     }
    //     System.out.println("Total Sum of even number of Arraya is : "+sum);
        
    // }


    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr ekement to search :");
        int key = sc.nextInt();
        // boolean result = false;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter your number:");
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                // result = true;
                System.out.println("present at index:  "+i);
            }else{
                // result = false;
            }
            
        }

        // if (result==true) {
        //     System.out.println("Present!!");
        // }else{
        //     System.out.println("Not Present!!");
        // }

        
    }
}
