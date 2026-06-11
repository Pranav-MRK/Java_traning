package Day8.File;

import java.io.PrintWriter;
import java.util.HashSet;

import Day7.ArrayList.NameUtil;

public class Array_read {

    public static void writeNamesToWelcomeFile() {
        HashSet<String> names = NameUtil.getAllNames();

        try (PrintWriter writer = new PrintWriter("Welcome.txt")) {
            for (String name : names) {
                writer.println(name);
            }
            System.out.println( " names to Welcome.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeNamesToWelcomeFile();
    }
}
