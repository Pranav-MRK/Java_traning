package Day8.LifeCycleOfThread;

public class My_Thread implements Runnable {
    @Override
    public void run(){
        System.out.println("-----Started----"+Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        
        
        
        
        System.out.println("-----Started----"+Thread.currentThread().getName());
    }
}
