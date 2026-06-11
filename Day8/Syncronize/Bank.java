package Day8.Syncronize;

public class Bank {
    private int accNo;
    private String name;
    private String email;
    private double balance;

    public void addDetails(int id, double am, String na, String em) {
        this.accNo = id;
        this.balance = am;
        this.name = na;
        this.email = em;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + this.balance);
        } else {
            System.out.println("Insufficient Balance! Current Balance: " + this.balance);
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accNo=" + accNo +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", balance=" + balance +
                '}';
    }
}
