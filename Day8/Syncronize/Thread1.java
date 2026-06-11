package Day8.Syncronize;

import Day4.Bank.Account;

public class Thread1 extends Thread {
    private Account act;
    public Thread1(Account act){
        this.act =act;
    }
    public void run(){
        System.out.println("Thread started");
        act.creditA(2000);
        System.out.println("Thread 1 ended");
    }
}
