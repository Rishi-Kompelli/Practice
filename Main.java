abstract class Shape{
    abstract double area();
    void display(){
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
}

public class Main {
    public static void main(String[] args){
        Shape circle = new Circle(5);
        circle.display();
        System.out.println("Circle Area: "+circle.area());
    }
}
