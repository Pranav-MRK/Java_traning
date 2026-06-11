package Day5.Employee;

// import java.util.jar.Attributes.Name;

public class Manager extends Employee {
    public Manager(){
        System.out.println("Deafault constructor of Child........");
    }
    public Manager(int Emp_id,String name,int Salary){
        super(Emp_id,name,Salary);
    }
    @Override
    public void Salary(){
        System.out.println("Salary :$100000");
    }
    
}
