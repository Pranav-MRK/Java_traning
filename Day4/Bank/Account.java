package Day4.Bank;

public class Account {
    private int atcid;
    private String name;
    private double balance;

    // calling construtor 
    public Account (){
        System.out.println("Called Deafult constructor!");
        atcid=04;
        name="Pranav";
        balance=100000;
    }

    // Parametrized Constructor
    public Account(int atcid,String name,double balance){
        System.out.println("Calling parameterized Constructor");
        this.atcid=atcid;
        this.name=name;
        this.balance=balance;
    }

    // methoud 
    // public void show_Details(){
    //     System.out.println("-------------------Account Details----------------");
    //     System.out.println("Acct id: "+atcid);
    //     System.out.println("Name: "+name);
    //     System.out.println("Balance: "+balance);
    // }
    public synchronized void creditA(int amount){
        if (amount>balance) {
            System.out.println("Sorry you dont have sufficent balance...");
        }
        else{
            System.out.println("Crediting: "+ amount);
            balance=balance-amount;
            System.out.println("Balnace avalable: "+ balance);
        }
    }

    // Setter
    public void setName(String name){
        System.out.println("-----------using setter--------");
        this.name = name;
    }

    //getter
    public String getName(){
        System.out.println("-----using getter---------");
        return name;
    }
    // methoud 
    public synchronized void depositeA(int amount){
        System.out.println("Depositing amount: "+ amount);
        balance= balance+amount;
        System.out.println("Balance available : " + balance);
    }

    // change the Day4.Bank.Account@6e0be858 -> to  11 Ajay 10000.0
    public String toString(){
        return " "+atcid+" "+name+" "+balance ;
    }
    

    
}
