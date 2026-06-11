package Day9.ThreadCommunication;

public class Deposite extends Thread {
    // on which object to perform we take it 
    private Account act;

    public Deposite(Account act){
        this.act = act;
    }
    // why to override run methoud 
    // because it run methoud is  empty run method dose nothing
    
    @Override   
    public void run (){
        try {
            System.out.println("Deposite thread started...");
            Thread.sleep(2000);
            act.deposite(2000);
            System.out.println("Deposite thread over......");
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
  
        }
    }
}
