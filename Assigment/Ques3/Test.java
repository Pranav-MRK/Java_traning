package Assigment.Ques3;

public class Test {
    public static void main(String[] args) {
        Date obj = new Date();
        System.out.println(obj);

        Date obj1 = new Date(04, 04, 2005);
        obj1.showDate();
        obj1.setMonth(1);
        System.out.println(obj1.getMonth());



    }
}
