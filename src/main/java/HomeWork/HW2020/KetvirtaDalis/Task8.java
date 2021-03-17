package HomeWork.HW2020.KetvirtaDalis;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu");
        float firstNumber = scanner.nextFloat();

        System.out.println("Iveskite veiksmo operatoriu");
        char operator = scanner.next().charAt(0);

        System.out.println("Iveskite antra skaiciu");
        float secondNumber = scanner.nextFloat();

        System.out.println(quickMaths(firstNumber, secondNumber, operator));

    }

    static double quickMaths (float firstNumber, float secondNumber, char operator) {
        double answer = 0.0;
        if (operator == '+') {
            answer = firstNumber + secondNumber;
        } else if (operator == '-') {
            answer = firstNumber - secondNumber;
        } else if (operator == '/') {
            if (secondNumber != 0) {
                answer = firstNumber / secondNumber;
            } else {
                System.out.println("Cannot calculate");
                return 0;
            }
        } else if (operator == '*') {
            answer = firstNumber * secondNumber;
        } else System.out.println("invalid symbol");
        return answer;
    }

}



