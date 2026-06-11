package Day7.ArrayList;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<String>myName = NameUtil.getAllNames();

        System.out.println(myName);

        System.out.println("Add dupli");
        myName.add("SuperMan");
        System.out.println(myName);

    }
   
    
}
