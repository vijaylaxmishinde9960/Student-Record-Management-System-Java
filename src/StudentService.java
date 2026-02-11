import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("\n--- All Students ---");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("--- End of List ---");
    }

    public void searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("\n--- Search Result ---");
                System.out.println("Student found: " + s);
                System.out.println("--- End Search ---");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void sortByMarks() {
        Collections.sort(students, Comparator.comparingInt(Student::getMarks));
        System.out.println("Students sorted by marks.");
    }
}
