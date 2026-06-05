package Assigment.Ques5;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x for Point 1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y for Point 1: ");
        int y1 = sc.nextInt();

        System.out.print("Enter x for Point 2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y for Point 2: ");
        int y2 = sc.nextInt();

        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);

        System.out.println("Point 1: " + p1.show());
        System.out.println("Point 2: " + p2.show());
        System.out.println("Points equal: " + p1.isEqual(p2));
        System.out.println("Distance between points: " + p1.calculateDistance(p2));

        sc.close();
    }
}
