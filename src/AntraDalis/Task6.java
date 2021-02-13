package AntraDalis;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int skaicius = scanner.nextInt();

        System.out.println(HarmonicSum(skaicius));
    }

    static double HarmonicSum(int a){
        double i, harmonic = 0.0;
            for (i = 1; i < a; i++) {
                harmonic = harmonic + 1 / i;
            }
        return harmonic;
    }
}
