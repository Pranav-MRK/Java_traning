package Assigment.Ques2;



public class Person {
    private String name;
    private int age;
    private String city;


    public Person(){
        System.out.println("Called the Deafult constructors......");
    }

    public Person(String name,int age,String city){
        System.out.print("Called the Parameterized Constructor......");
        this.name=name;
        this.age=age;
        this.city=city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("age : "+age);
        System.out.println("city : "+city);
    }

}
