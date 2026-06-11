package Day8.thread;

public class Test_even_odd {
    public static void main(String[] args) {
        System.out.println("-------Main Start--------");

        EvenThread e = new EvenThread();

        Thread t1 = new Thread(e);
        t1.setName("Even Thread");
        t1.start();

        
        OddThread o = new OddThread();
        Thread t2  = new Thread(o);
        t2.setName("Odd Thread");
        t2.start();
    }
}
