package HomeWork.February22.Task2;

public class RegularPolygonMain {

    public static void main(String[] args) {
        EquilateralTriangle equilateralTriangle1 = new EquilateralTriangle(6);
        Square square1 = new Square(5);

        //Kvadrato perimetras ir plotas
        System.out.println("Kvadrato plotas: " + square1.getArea());
        System.out.println("Kvadrato perimetras: " + square1.getPerimeter());

        //Lygiakrascio trikampio perimetras ir plotas
        System.out.println("Lygiakrascio trikampio plotas: " + equilateralTriangle1.getArea());
        System.out.println("Lygiakrascio trikampio perimetras: " + equilateralTriangle1.getPerimeter());

        //Krastiniu skaicius
        System.out.println("Kvadratas turi " + square1.getNumSides() + " krastines.");
        System.out.println("Lygiakrastis trikampis turi " + equilateralTriangle1.getNumSides() + " krastines.");

        //Krastines ilgis
        System.out.println("Kvadrato krastines ilgis yra " + square1.getSideLength());
        System.out.println("Lygiakrascio trikampio krastines ilgis yra " + equilateralTriangle1.getSideLength());
    }
}
