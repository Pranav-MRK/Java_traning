package Day8.File;

import java.io.PrintWriter;

public class Write {
    public static void main(String args[]){
        try {
            PrintWriter writ = new PrintWriter("Data.txt");
            writ.print("Hey Pranav....!");
            writ.print("Welcome to Taj!");
            writ.print("The Kumbhar group of companies...!");
            writ.close();
            
        } catch (Exception e) {
       
            e.fillInStackTrace();
        }
    }
}
