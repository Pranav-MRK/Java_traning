package Assigment.Ques1;

public class Student {
    private int roll_no;
    private int marks1;
    private int marks2;
    private int marks3;


    public void acceptIfo(int r ,int m1,int m2,int m3){
        this.roll_no=r;
        this.marks1=m1;
        this.marks2=m2;
        this.marks3=m3;
    }
    public void displayInfo(){
        System.out.println("roll : "+ roll_no+" "+"mark1: "+marks1+" "+"mark2: "+marks2+" "+"mark3: "+marks3);
    }
    public void total_percen_Grade(){
        int sum = marks1+marks2+marks3;
        int percent = sum/3;
        String grad ="A";
        
        System.out.println("Total Marks : "+sum);
        System.out.println("Percentage  : "+percent);
        System.out.println("Total grads : "+grad);
    }
    
}
