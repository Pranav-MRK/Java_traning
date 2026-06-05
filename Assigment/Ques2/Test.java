package Assigment.Ques2;

public class Test {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.displayInfo();

        Person obj1 = new Person("Pk", 20, "Pune");

        obj1.displayInfo();

        obj1.setName("Pranav");
        System.out.println(obj1.getName());


        
    }
}
