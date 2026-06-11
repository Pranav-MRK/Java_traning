package Day6.String;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        String n = sc.next();

        System.out.println(n.equals("Pranav"));

        if (n.equals("Pranav")) {
            System.out.println("Welcome Pranav......");
        }else{
            System.out.println("Welcome");
        }
    
    }
}
