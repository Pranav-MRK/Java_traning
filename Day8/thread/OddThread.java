package Day8.thread;

public class OddThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Strat 2nd");
        for (int i = 0; i <= 10; i++) {
            if (i%2 !=0) {
                System.out.println("its odd :" +i);
            }
        }
        System.out.println("Ends 2nd");
    }
}
