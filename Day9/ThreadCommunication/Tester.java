package Day9.ThreadCommunication;

public class Tester {
    public static void main(String[] args) throws InterruptedException {
        Account act = new Account(101, "Ram", 3000);

        Deposite t1 = new Deposite(act);
        Withdraw t2 = new Withdraw(act);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Main thread end");
    }

}
