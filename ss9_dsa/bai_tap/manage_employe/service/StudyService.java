package ss9_dsa.bai_tap.manage_employe.service;
import ss9_dsa.bai_tap.manage_employe.model.Study;

import java.time.LocalDate;
import java.util.ArrayList;

public class StudyService extends Study implements IStudy{
    public StudyService(String id, String name, LocalDate date, String gender, String classStudy, double point) {
        super(id, name, date, gender, classStudy, point);
    }
    public static ArrayList<Study> student =new ArrayList<>();

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void display() {

    }
}
