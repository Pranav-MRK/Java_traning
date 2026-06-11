package Day8.File;

import java.io.File;

public class Test_File {
    public static void main(String[] args) {
        // create an object file

        String fileName = "nofile.txt";
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("File exists");
            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Can read: " + file.canRead());
            System.out.println("Can write: " + file.canWrite());
            System.out.println("Length: " + file.length());
        } else {
            System.out.println("Not exist");
            try {
                if (file.createNewFile()) {
                    System.out.println("Created: " + file.getAbsolutePath());
                } else {
                    System.out.println("Failed to create file");
                }
            } catch (java.io.IOException e) {
                System.out.println("Failed to create file: " + e.getMessage());
            }
        }
    }
}
