package Day7;

import java.util.HashMap;

import Day7.Book.Book;
import Day7.Book.BookUtil;

public class Hash {
    public static void main(String[] args) {
        HashMap<Integer, Book> map = BookUtil.getAllBooks();

        

        System.out.println(map);

        // map.remove(103);
        // System.out.println(map);


        // if (map.containsKey(102)) {
        //     System.out.println("Yes it contain");
        // }else{
        //     System.out.println("Not conatain..");
        // }
    }
}
