package Day8.Syncronize;

import Day4.Bank.Account;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Account act = new Account(101, "Pranav", 50000);

        System.out.println("Initial account state: " + act);

        Thread1 t1 = new Thread1(act);
        Thread2 t2 = new Thread2(act);

        System.out.println("Starting threads...");
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("All threads finished.");
        System.out.println("Final account state after withdraw and deposit: " + act);
    }
}
