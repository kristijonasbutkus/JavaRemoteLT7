package HomeWork.February22.Task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle("Apskritimas", 5);
        RightAngleRectangle rightAngleTriangle1 = new RightAngleRectangle(10, 12.5);
        Rectangle rectangle1 = new Rectangle(15, 11.2);

        double circleArea = circle1.circleArea();
        double circlePerimeter = circle1.circlePerimeter();

        double triangleArea = rightAngleTriangle1.triangleArea();
        double rectangleArea = rectangle1.rectangleArea();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(InputOutputUtils.RESULT_FILE_LOCATION))){
            bufferedWriter.write("Apskritimo plotas: " + circleArea);
            bufferedWriter.write("\nApskritimo ilgis: " + circlePerimeter);
            bufferedWriter.write("\nTrikampio plotas: " + triangleArea);
            bufferedWriter.write("\nStaciakampio plotas: " + rectangleArea);

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
