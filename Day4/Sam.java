package Day4;

public class Sam {
    int day;
    int month;
    int year;
    public Sam(){
        System.out.println("Using Deafult Constructors...!");
        day=4;
        month=4;
        year = 2005;
    }

    public Sam(int i,int j,int k){
        System.out.println("Called the parameterized Constructor");
        day=i;
        month=j;
        year=k;
    }
    public void give_Date() {
        System.out.println(day+" /"+month+" /"+year);
    }
}
