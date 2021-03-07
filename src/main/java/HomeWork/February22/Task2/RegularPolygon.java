package HomeWork.February22.Task2;

public interface RegularPolygon {

    int getNumSides();

    double getSideLength();

    default double getPerimeter() {
        return 0;
    }
    // naudotas getArea vietoje kazkokio getInteriorAngle..?
    default double getArea() {
        return 0;
    }
}
