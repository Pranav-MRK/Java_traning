package Day7.Book;

import java.util.HashMap;

public class BookUtil {
    public static HashMap<Integer,Book> getAllBooks(){
        HashMap<Integer,Book> myBks = new HashMap<>();
		// size 0

		myBks.put(100,new Book(102, "YT", "Pranav", 901));

		myBks.put(101,new Book(23, "HarryPotter", "JK Rowlling", 930));
		

		return myBks;//
    }
}
