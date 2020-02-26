package Ex1.Shape;

public class Rectangle extends Shape {


    double base;
    double height;

    double area;
    double perimeter;


    public Rectangle(String shapeName, int base, int height) {
        super(shapeName);
        this.base = base;
        this.height = height;
    }


    public Rectangle(String shapeName, int base){
        super(shapeName);
        this.base = base;
    }

    @Override
    public double getArea() {
        area = base*height;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = (base*2) + (height*2);
        return perimeter;
    }






}
