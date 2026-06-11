package Day6.Shape;

public class Test {
    public static void main(String[] args) {
        
        Shape obj = new Square();
        calArea(obj);
        Shape obj1 = new Circle(); 
        calArea(obj);
        calArea(obj1);

    }
    public static void calArea(Shape obj){
        obj.area();
    }
}
