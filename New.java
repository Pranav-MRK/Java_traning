import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //*********************Assigment 4***********************
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1>num2) {
            System.out.println("num1 is greater than num2");
        }else if (num1<num2) {
            System.out.println("num2 greater than num1");
        }else{
            System.out.println("num1 and num2 are equal");

        }

        

        //  *******************Assigment 5************************
        // int age;
        // System.out.println(" your age");
        // age = sc.nextInt();
        // System.out.println("your age: " + age);
        // System.out.println("Status :");
        // if(age>=18) System.out.println("Eligibal to Vote");
        // else{
        //     System.out.println("Not eligible to vote");
        // }

    }
}
