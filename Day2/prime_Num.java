package Day2;

public class prime_Num {
    public static void main(String args[]){
        int no = 10;
        for (int i = 2; i <no; i++) {
            if (no % i == 0) {
                System.out.println("Not Prime");
                break;
            }
        }
    }
}
