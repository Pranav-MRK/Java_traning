package Day4.Bank;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account[] allAcc = new Account[5];
        Account obj = new Account();
        
        // obj.show_Details();
        obj.creditA(10);



        // setter is called 
        System.out.println("Enter name to change : ");
        String name = sc.next();
        obj.setName(name);
        obj.getName();

        // objectc to add in array

        Account obj1 = new Account(11, "Ajay", 10000);
        Account obj2 = new Account(12, "Prana", 1500000);
        Account obj3 = new Account(13,"kumbh",200000);
        Account obj4 = new Account(14,"mk",25000);
        Account obj5 = new Account(15,"Pk",25020);

        allAcc[0]=obj1;
        allAcc[1]=obj2;
        allAcc[2]=obj3;
        allAcc[3]=obj4;
        allAcc[4]=obj5;


        for (int i = 0; i < allAcc.length; i++) {
            System.out.println(allAcc[i]);
        }

    }
}
