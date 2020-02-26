package Ex1.Shape;

public class Square extends Rectangle {

    public Square(String shapeName, int base) {
        super(shapeName, base);
    }


    @Override
    public double getArea() {
        area = base*base;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = (base*4);
        return perimeter;
    }




}
