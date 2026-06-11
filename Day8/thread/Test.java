package Day8.thread;

// import Day7.ArrayList.Second;

public class Test {
    public static void main(String[] args) {
        System.out.println("default thread...."+Thread.currentThread().getName());
        Thread1 t1 = new Thread1();
        t1.setName("Thread1");
        t1.start();
        System.out.println("--------------Stop process------------");
        ImpThread t2 = new ImpThread();
        t2.setName("Decremat");
        t2.start();



    }
}
