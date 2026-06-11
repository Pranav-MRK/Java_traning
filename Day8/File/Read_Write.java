package Day8.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;


public class Read_Write {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Data.txt")) ; PrintWriter writer = new PrintWriter("Welcome.txt")
    ){
        String str = "null";
        while ((str = reader.readLine())!=null) {
            writer.println(str);
        }
        System.out.println("Done the Transfere of Data");
            
        } catch (Exception e) {
          
            e.fillInStackTrace();
        }
    }
}
