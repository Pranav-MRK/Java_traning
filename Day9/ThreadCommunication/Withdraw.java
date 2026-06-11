package Day9.ThreadCommunication;

public class Withdraw extends Thread  {



    // on which object to perform we take it 
    private Account act;

    public Withdraw(Account act){
        this.act = act;
    }
    // why to override run methoud 
    // because it run methoud is  empty run method dose nothing
    
    @Override   
    public void run (){
        try {
            System.out.println("Withdraw thread started...");
            Thread.sleep(2000);
            act.withdraw(4000);
            System.out.println("Withdraw thread over......");
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
            
        }
    }

}

