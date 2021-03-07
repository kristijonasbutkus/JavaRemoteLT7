package PenktaDalis;

import java.util.Scanner;



public class Task11 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String zodis = scanner.nextLine();

        vaziuojam(zodis);

    }
    static void vaziuojam(String zodis) {
        Scanner scanner = new Scanner(System.in);
        int stringLengthMax = 0;
        String max = "";

        while  (!zodis.equals("Enough!")) {

            int kiek = zodis.length();
            if (kiek == 0){
                System.out.println("No text provided");
            }
            else if (kiek >= stringLengthMax) {
                stringLengthMax = kiek;
                //System.out.println(kiek);
                max = zodis;
            }
            zodis = scanner.nextLine();
        }
        System.out.println(max);
    }
}
