package HomeWork.February22.Task1;

// STATUSIS TRIKAMPIS
public class RightAngleRectangle {
    double width;
    double height;

    public RightAngleRectangle ( double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double triangleArea () {
        return (width * height) / 2;
    }
}
