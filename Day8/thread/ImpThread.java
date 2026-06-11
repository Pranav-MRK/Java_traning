package Day8.thread;

public class ImpThread extends Thread{
    public void run(){
        System.out.println("Child2 thread Started.....");

        for(int i=10;i<0;i--){
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
