package ss9_dsa.bai_tap.manage_employe.model;

import java.time.LocalDate;

public class Study extends PersonCodeGym{
    private String classStudy;
    private double Point;

    public Study(String id, String name, LocalDate date, String gender, String classStudy, double point) {
        super(id,name,date,gender);
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
}
