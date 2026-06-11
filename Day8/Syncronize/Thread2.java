package Day8.Syncronize;

import Day4.Bank.Account;

public class Thread2 extends Thread {
    private Account act;
    public Thread2(Account act){
        this.act =act;
    }
    @Override
    public void run(){
        System.out.println("Thread started");
        act.depositeA(3000);
        System.out.println("Thread2 ended");
    }
}
