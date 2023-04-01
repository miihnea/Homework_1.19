import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Creăm o listă de studenți
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", 8));
        studentList.add(new Student("Jane", 7));
        studentList.add(new Student("Bob", 9));
        studentList.add(new Student("Alice", 6));

        // Sortăm lista de studenți după notă
        Collections.sort(studentList);

        // Afișăm lista de studenți sortată după notă
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}