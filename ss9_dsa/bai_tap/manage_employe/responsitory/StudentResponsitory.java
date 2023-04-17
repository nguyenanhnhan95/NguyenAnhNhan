package ss9_dsa.bai_tap.manage_employe.responsitory;

import ss9_dsa.bai_tap.manage_employe.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentResponsitory implements ICodeGymResponsitory<Student> {
    private static List<Student> studies = new ArrayList<Student>();

    static {
//        String id, String name, String date, String gender, String classStudy, double point
        studies.add(new Student("25", "Nguyễn Anh Nhàn", "1995", "Nam", "C0223G1", 9));
        studies.add(new Student("35", "Nguyễn Anh Vũ", "1994", "Nam", "C0123G1", 8));

    }

    @Override
    public List<Student> getList() {
        return studies;
    }

    @Override
    public void delete(int index) {
        studies.remove(index);
    }

    @Override
    public void add(Student study) {
        studies.add(study);
    }

}
