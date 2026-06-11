package Day10.Bank;

public class Account {
    private int AccID;
    private String name,email,pwd;
    private double balance;

    public Account(int AccID,String name,String email,String pwd,double balance){
        this.AccID=AccID;
        this.name=name;
        this.email=email;
        this.pwd=pwd;
        this.balance=balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccID=" + AccID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }

    public int getAccID() {
        return AccID;
    }

    public void setAccID(int AccID) {
        this.AccID = AccID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

