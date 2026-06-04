package Day3;

public class Emp {
    private int emid;
    private double salary;
    private String name;

    public void assignDetails(int id,double sa,String nm){
        emid =id;
        salary=sa;
        name =nm;
        System.out.println("----------Employee details are saved------------");
    }
    public void Display(){
        System.out.println("Displaying the data");
        System.out.println(emid);
        System.out.println(salary);
        System.out.println(name);
    }
    
}
