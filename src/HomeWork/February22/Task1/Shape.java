package HomeWork.February22.Task1;

public abstract class Shape {

    protected String shapeDescription;

    public Shape (String shapeDescription) {
        this.shapeDescription = shapeDescription;
    }

    public abstract double circlePerimeter();
    public abstract double circleArea();
}
