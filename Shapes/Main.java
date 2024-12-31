abstract class Shape{
    abstract double area();
    abstract String name();
    void display(){
        System.out.println("Calculating area of "+name()+"...");
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
    @Override
    public String name(){
        return "Circle";
    }
}

class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double area() {
        return length*width;
    }
    @Override
    public String name(){
        return "Rectangle";
    }
}

class Triangle extends Shape{
    double base;
    double height;
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    public double area() {
        return 0.5*base*height;
    }
    @Override
    public String name(){
        return "Triangle";
    }
}

public class Main {
    public static void main(String[] args){
        Shape circle = new Circle(5);
        circle.display();
        System.out.println("Circle Area: "+circle.area());
        Shape rectangle = new Rectangle(5,5);
        rectangle.display();
        System.out.println("Rectangle Area: "+rectangle.area());
        Shape triangle = new Triangle(10,5);
        triangle.display();
        System.out.println("Triangle Area: "+triangle.area());
    }
}
