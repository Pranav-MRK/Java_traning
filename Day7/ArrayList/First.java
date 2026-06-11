package Day7.ArrayList;

import java.util.ArrayList;

public class First {
    public static void main(String[] args) {
        ArrayList<String> strList= new ArrayList<>();
        ArrayList<Integer> strList1= new ArrayList<>();
        System.out.println("isArray Empty :" +strList.isEmpty());
        strList1.add(123);

        strList.add("Pranav");
        strList.add("Vijay");
        strList.add("Marcob");
        strList.add("Rohan");
        strList.add("Athrava");
        strList.add("Madhuri");


        System.out.println(strList);


        for (String str : strList) {
            System.out.println(str);
        }

        strList.addFirst("BatMan");
        strList.remove(strList.remove(2));

        System.out.println(strList);

    }
}