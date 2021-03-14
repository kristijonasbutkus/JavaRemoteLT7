package design_patterns.adapter;

import lombok.var;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdapterUsage {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Pupil pupilAndrzej = new Pupil("Andrzej", "Nowak", "anowak@sda.pl", 19, Arrays.asList(3, 4, 5));
        PupilAdapter pupilAdapter = new PupilAdapter(pupilAndrzej);
        students.add(pupilAdapter);
        for (final var student : students) {
            System.out.println(student.getFullName()); // Andrzej Nowak
            System.out.println(student.getContactDetails()); // anowak@sda.pl
            System.out.println(student.getResults()); // [3, 4, 5]
            System.out.println(student.isAdult()); // true
        }
    }
}