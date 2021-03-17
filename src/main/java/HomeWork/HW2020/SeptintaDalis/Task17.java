package HomeWork.HW2020.SeptintaDalis;


import java.time.LocalDate;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ivedimas = scanner.nextLine();

        LocalDate nextLesson = LocalDate.parse(ivedimas); //Formatas -> 2018-05-05


        long likoDienu = ChronoUnit.DAYS.between(LocalDate.now(), nextLesson);
        System.out.println("Iki paskaitos liko " + likoDienu + " dienos.");

    }
}
