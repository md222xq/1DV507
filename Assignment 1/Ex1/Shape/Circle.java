package Ex1.Shape;

public class Circle extends Shape {

    double radius;
    double area;
    double perimeter;

    public Circle(String ShapeName, double radius){
        super(ShapeName);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2*Math.PI*radius;
        return perimeter;
    }
}
