package Day9.ThreadCommunication;

public class Account {
   
    private int actid;
    private String name;
    private double balance;

    public Account(int actid, String name, double balance) {
        this.actid = actid;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "actid=" + actid +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void deposite(double amount) throws InterruptedException{
        System.out.println("Started Deposite : "+Thread.currentThread().getName());
        

        balance = balance + amount;
        // notify all waiting condition.
        this.notifyAll();
        Thread.sleep(2000);
        System.out.println("balance : "+ balance);
        System.out.println("end Deposite : "+Thread.currentThread().getName());


    }
    public synchronized void  withdraw(double amount) throws InterruptedException{
        System.out.println("Started Withdraw : "+Thread.currentThread().getName());
        
        if (balance<amount) {
            System.out.println("Waiting for deposite to occur");
            this.wait();
        }
        balance = balance - amount;

        Thread.sleep(2000);
        System.out.println("balance : "+ balance);
        System.out.println("end withdraw : "+Thread.currentThread().getName());


    }


}
