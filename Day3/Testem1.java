package Day3;

public class Testem1 {
    public static void main (String args[]){
        // Emp obj = new Emp();

        // obj.assignDetails(44, 1000000, "Pranav");
        // obj.Display();


        Book obj = new Book();
        obj.NewBook(04, "Harry Potter","J.K.Rowlling" , 999);
        obj.Display();

        Date obj1 = new Date();
        obj1.assignDate(04, 04, 2005);
        obj1.showDate();
    }
}
