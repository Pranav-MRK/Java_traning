package Day5.Employee;

public class Employee {
    private int Emp_id;
    private String name;
    private int Salary;

    public Employee(){
        System.out.println("Deafult Constructor is called.......");
    }
    public Employee(int Emp_id,String name,int Salary){
        System.out.println("Parametarized Constructor is called.......");
        this.Emp_id=Emp_id;
        this.name=name;
        this.Salary=Salary;
    }
    
    public void Salary(){
        System.out.println("Salary :$100000");
    }
    public String toString(){
        return " id of emp : "+Emp_id+" ||"+"name: "+name+" ||"+"Salary : "+ Salary;
    }
}
