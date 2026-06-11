package Day9.Thread;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Account act = new Account(101, "Ram", 10000);

        Withdraw t1 = new Withdraw(act);
        Deposite t2 = new Deposite(act);

        t1.start();
        t2.start();


        t1.join();
        t2.join();

        System.out.println("Main Thread over ");
    }
}
