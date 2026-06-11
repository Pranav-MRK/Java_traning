package Day5.Car;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);

        Car[] myCars = new Car[3];

        System.out.println("Select 1:BMW,2:Ferrari,3:Nano");
        int i=0;

        do {
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    if (i<myCars.length) {
                        Bmw bobj = new Bmw();
                        myCars[i] =bobj;// upcasting
                        i++;
                        System.out.println("Bmw added");
                    }else{
                        System.out.println("------Full-------");
                    }
                    break;
                case 2:
                    if (i<myCars.length) {
                        Ferrari fobj = new Ferrari();// upcasting
                        myCars[i] =fobj;
                        i++;
                        System.out.println("Ferrari added");
                    }else{
                        System.out.println("------Full-------");
                    }
                    break;
                case 3:
                    if (i<myCars.length) {
                        Nano nobj = new Nano();
                        myCars[i] =nobj;
                        i++;
                        System.out.println("Nano added");
                    }else{
                        System.out.println("------Full-------");
                    }
                case  4:
                    System.out.println("start race");
                    for (int j = 0; j < myCars.length; j++) {
                        if (myCars[i] != null) {
                            myCars[i].speed();
                        }
                    }   
                    break;    
                default:
                    break;
            }
        } while (ch!=5);


    }
}
