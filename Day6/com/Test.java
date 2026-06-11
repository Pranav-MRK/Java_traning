package Day6.com;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Category: OILS,GRAINS,OTHER");
        String cate = sc.next();

        // Category predCaste=Category.GRAINS;
        // System.out.println(predCaste);
        Category produCategory = Category.valueOf(cate.toUpperCase());
        System.out.println("Category"+produCategory);

        sc.close();
    }
}
