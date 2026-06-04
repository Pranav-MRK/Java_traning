package Day3;

public class Bank {
    private int accNo;
    private String name;
    private String email;
    private double Balance;
    

    public void addDetails(int id,double am,String na,String em){
        accNo = id;
        Balance = am;
        name = na;
        email =em;

    }
    public void credit(int amount){
        System.out.println("--------------Money withdrawing---------------");
        if (Balance<amount) {
            System.out.println("Sorry you dont have enough Balance");
        }else{
            Balance =Balance-amount;
            System.out.println("Balance after withdraw : " + Balance);

        }
        
    }
    public void Balance(){
        System.out.println("Your Balance : "+ Balance);
    }
    public void deposite(int amount){
        System.out.println("------------Money Deposite-------------");
        Balance =Balance+amount;
        System.out.println("Balance after deposite : " + Balance);
    }
    public void showAccountHolder(){
        System.out.println("-------Account details---------");
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Account Number: "+accNo);
        System.out.println("Balance ava: "+Balance);
        
        
        

    }
}
