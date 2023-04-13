package ss9_dsa.bai_tap.test.view;

import ss9_dsa.bai_tap.test.service.ITeacher;
import ss9_dsa.bai_tap.test.model.Person;

public class Teacher extends Person implements ITeacher {
    private String educationDegree;

    public Teacher(String name, String email, String educationDegree) {
        super(name, email);
        this.educationDegree = educationDegree;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "educationDegree='" + educationDegree + '\'' +
                "} " + super.toString();
    }

    @Override
    public void teach() {
        System.out.println("Đang dạy IT");
    }

    @Override
    public void doSth() {

    }
}
