package Day8.Serization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Tester_deSerialize {
    public static void main(String args[]){
        try (ObjectInputStream read = new ObjectInputStream(new FileInputStream("ProductStore.txt") )){
            Product p=(Product)read.readObject();//return Object type
			System.out.println(p);
			
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
