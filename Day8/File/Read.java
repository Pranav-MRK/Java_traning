package Day8.File;

import java.io.BufferedReader;
import java.io.FileReader;

public class Read {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new  FileReader("Data.txt"));
            String str = null;
            while ((str=reader.readLine())!= null) {
                System.out.println(str);
            }
            reader.close();
        } catch (Exception e) {
           
            e.fillInStackTrace();
        }
    }
}
