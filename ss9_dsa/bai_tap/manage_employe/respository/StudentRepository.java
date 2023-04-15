package ss9_dsa.bai_tap.manage_employe.respository;

import ss9_dsa.bai_tap.manage_employe.model.PersonCodeGym;
import ss9_dsa.bai_tap.manage_employe.model.Study;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements ICodeGymRepository<Study> {
    private static List<Study> studies = new ArrayList<Study>();

    static {
//        String id, String name, String date, String gender, String classStudy, double point
        studies.add(new Study("25", "Nguyễn Anh Nhàn", "1995", "Nam", "C0223G1", 9));
        studies.add(new Study("35", "Nguyễn Anh Vũ", "1994", "Nam", "C0123G1", 8));

    }

    @Override
    public List<Study> getList() {
        return studies;
    }

    @Override
    public void delete(int index) {
        studies.remove(index);
    }

    @Override
    public void add(Study study) {
        studies.add(study);
    }

}
