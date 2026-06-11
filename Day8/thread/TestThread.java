package Day8.thread;

public class TestThread {
    public static void main(String[] args) {
        System.out.println("default thread....");
        Thread1 t1 = new Thread1();
        t1.setName("Thread1");
        t1.start();
        System.out.println("--------------Stop process------------");
    }
}
