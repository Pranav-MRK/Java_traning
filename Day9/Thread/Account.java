package Day9.Thread;

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

    public synchronized void deposite(double amount) throws InterruptedException{
        System.out.println("Started Deposite : "+Thread.currentThread().getName());
        

        balance = balance + amount;

        Thread.sleep(2000);
        System.out.println("balance : "+ balance);
        System.out.println("end Deposite : "+Thread.currentThread().getName());


    }
    public synchronized void  withdraw(double amount) throws InterruptedException{
        System.out.println("Started Withdraw : "+Thread.currentThread().getName());
        

        balance = balance - amount;

        Thread.sleep(2000);
        System.out.println("balance : "+ balance);
        System.out.println("end withdraw : "+Thread.currentThread().getName());


    }

}
