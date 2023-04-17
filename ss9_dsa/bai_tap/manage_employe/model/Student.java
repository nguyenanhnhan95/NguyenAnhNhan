package ss9_dsa.bai_tap.manage_employe.model;

import java.time.LocalDate;

public class Student extends PersonCodeGym {
    private String classStudy;
    private double Point;

    public Student() {

    }

    public Student(String id, String name, String date, String gender, String classStudy, double point) {
        super(id, name, date, gender);
        this.classStudy = classStudy;
        Point = point;
    }

    public String getClassStudy() {
        return classStudy;
    }

    public void setClassStudy(String classStudy) {
        this.classStudy = classStudy;
    }

    public double getPoint() {
        return Point;
    }

    public void setPoint(double point) {
        Point = point;
    }

    @Override
    public String toString() {
        return "Study{" + super.toString() +
                "classStudy='" + classStudy + '\'' +
                ", Point=" + Point +
                "}\n";
    }
}
