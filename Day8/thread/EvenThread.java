package Day8.thread;

public class EvenThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Strat 1st");
        for (int i = 0; i <= 10; i++) {
            if (i%2 ==0) {
                System.out.println("its even :"+i);
            }
        }
        System.out.println("Ends 1st");
    }
}
