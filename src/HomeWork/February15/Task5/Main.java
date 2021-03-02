package HomeWork.February15.Task5;

import java.text.DecimalFormat;

public class Main {


    public static void main(String[] args) {

        Circle circle1 = new Circle(8, "Black");

        DecimalFormat df = new DecimalFormat(".##");
        System.out.println("Apskritimo plotas: " + df.format(Circle.circleArea(circle1)) +
            ", perimetras: " + df.format(Circle.circlePerimeter(circle1)) +
                " bei jo spalva: " + circle1.color);
    }
}
