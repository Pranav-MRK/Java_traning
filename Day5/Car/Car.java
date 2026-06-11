package Day5.Car;

public class Car {
    private int carid;
    private String name;
    private double price;

    public Car(){
        super();
        System.out.println("Calling Deafault Constructor.......");
    }
    public void speed(){
        System.out.println("Car Speed is 60km/h");
    }
    public void name(){
        System.out.println("Its Car!");
    }

    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
