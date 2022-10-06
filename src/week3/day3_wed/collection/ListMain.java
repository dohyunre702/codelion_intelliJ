package week3.day3_wed.collection;

import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();

        List<String> students = listExercise.getStudents();
        for (String student: students) {
            System.out.println(student);
        }
        System.out.println(students.size());
    }
}
