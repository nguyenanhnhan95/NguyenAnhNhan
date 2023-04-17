package ss9_dsa.bai_tap.manage_employe.responsitory;

import ss9_dsa.bai_tap.manage_employe.model.Tutor;

import java.util.ArrayList;
import java.util.List;

public class TutorResponsitory implements ICodeGymResponsitory<Tutor> {
    private static List<Tutor> tutors = new ArrayList<Tutor>();

    static {
//        public Tutor(String id, String name, String date, String gender, String specialize)
        tutors.add(new Tutor("26", "Chánh", "1987", "Nam", "Module 1"));
        tutors.add(new Tutor("26", "Trung", "1998", "Nam", "Module 2"));
    }

    @Override
    public List<Tutor> getList() {
        return tutors;
    }

    @Override
    public void delete(int index) {
        tutors.remove(index);
    }

    @Override
    public void add(Tutor tutor) {
        tutors.add(tutor);
    }
}
