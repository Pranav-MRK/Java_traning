package Day5.Employee;

public class Test {
    public static void main(String[] args) {
       
       
     
        Manager emp[] = new Manager[3];
        Manager emp2 = new Manager(10, "Pranav", 00000);
        Manager emp3 = new Manager(11, "RK", 200000);
        Manager emp4 = new Manager(04, "PK", 400000);
        emp[0]=emp2;
        emp[1]=emp3;
        emp[2]=emp4;
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
        }
    }
}
