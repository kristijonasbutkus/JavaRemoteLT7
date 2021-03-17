package HomeWork.HW2020.PenktaDalis;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String zodis = scanner.nextLine();

        int zodzioIlgis = zodis.length();
        //System.out.println(zodzioIlgis);
        int counter = 0;

        for (char x : zodis.toCharArray()) {
            if (x == ' ') {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println(zodzioIlgis);
        double procentai = (counter * 100) / zodzioIlgis;
        System.out.println(procentai + " %");
    }
}
