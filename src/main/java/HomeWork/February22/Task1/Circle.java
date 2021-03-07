package HomeWork.February22.Task1;

public class Circle extends Shape{
    protected int radius;

    public Circle (String shapeDescription, int radius) {
        super(shapeDescription);
        this.radius = radius;
    }

    @Override
    public double circlePerimeter() {
     return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double circleArea() {
        return 2 * Math.PI * radius;
    }
}
