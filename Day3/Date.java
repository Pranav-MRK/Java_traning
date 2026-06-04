package Day3;

public class Date {
    private int day,month,year;
    public void assignDate(int d,int m,int y){
        day = d;
        month= m;
        year = y;
    }
    public void showDate(){
        System.out.println("Date:"+day+"/"+month+"/"+year);
    }

}
