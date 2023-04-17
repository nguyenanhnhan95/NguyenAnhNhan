package ss11_map_binary.thuc_hanh.student_old;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student("Nhàn", 28, "Hòa tiến");
        Student student1 = new Student("Quốc", 28, "Lê Đại Hành");
        Student student2 = new Student("Sang", 26, "Hòa Khánh");
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student);
        studentMap.put(4, student1);
        for (Map.Entry<Integer, Student> studentTest : studentMap.entrySet()) {
            System.out.println(studentTest.toString());
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student);
        students.add(student1);

        for (Student student5 : students) {
            System.out.println(student5.toString());
        }
    }
}
