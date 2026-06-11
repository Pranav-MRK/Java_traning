package Day8.thread;

public class Thread1 extends Thread {
    public void run(){
        System.out.println("Child thread Started.....");

        for(int i=0;i<10;i++){
            System.out.println(i);

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("==========Child thread Stop=====================");
        
    }    
}
