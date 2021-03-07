package HomeWork.February22.Task2;

public class EquilateralTriangle implements RegularPolygon{

    protected double length;

    public EquilateralTriangle (double length) {
        this.length = length;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public double getSideLength() {
        return length;
    }

    @Override
    public double getPerimeter() {
        return length * 3;
    }

    @Override
    public double getArea() {
        return (Math.pow(length,2) * Math.sqrt(3)) / 4;
    }

}
