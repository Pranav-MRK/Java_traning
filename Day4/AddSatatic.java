package Day4;

// import javax.xml.stream.events.StartDocument;

public class AddSatatic {
    private String name;
    public static String Company_name;
    int count;

    public  AddSatatic(){
        System.out.println("-----Constructor called-----");
    }

    public AddSatatic(String name){
        count++;
        this.name =name;

    }
    public static void display(){
        System.out.println(Company_name);
    }
    public  void display_Count(){
        System.out.println(count);
    }
    public  void display_name(){
        System.out.println(name);
    }
    

    static{
        System.out.println("------Welcome to Mit-------");
    }
    
}
