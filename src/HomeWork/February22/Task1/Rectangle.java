package HomeWork.February22.Task1;

public class Rectangle extends RightAngleRectangle{

    public Rectangle (double width, double height) {
        super (width, height);
    }

    public double rectangleArea () {
        return width * height;
    }
}
