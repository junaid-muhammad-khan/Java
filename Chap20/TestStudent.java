import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student(20, 175.5, 3.4);
        Student s2 = new Student(22, 180.0, 3.9);
        Student s3 = new Student(19, 165.2, 3.7);

        // Adding students to a list
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println("--- Before Sorting ---");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting the list using our custom StudentComparator
        Collections.sort(students, new StudentComparator());

        System.out.println("\n--- After Sorting (Highest GPA First) ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}