package Day8.LifeCycleOfThread;

public class Test {
    public static void main(String[] args) {
        System.out.println("Thread strat");
        My_Thread obj = new My_Thread();

        Thread t1 = new Thread(obj); // thread get created or born

        t1.start(); // ready to start --> runable


        try {
            t1.join(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // main thread will wait till t1 get over
        System.out.println("MainOver");


    }
}
