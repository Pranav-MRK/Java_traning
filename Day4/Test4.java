package Day4;

public class Test4 {
    public static void main(String[] args) {
    
        Sam obj=new Sam();
        obj.give_Date();


        System.out.println("----------ConstructorChange----------------");

        Sam obj1 = new Sam(04, 01, 1974);
        obj1.give_Date();
    }
    
    
}
