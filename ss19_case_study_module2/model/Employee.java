package ss19_case_study_module2.model;

import ss19_case_study_module2.utils.ELevelEducation;
import ss19_case_study_module2.utils.ELevelPosition;

import java.time.LocalDate;

public class Employee extends Person {
    private ELevelEducation levelEducation;
    private ELevelPosition levelPosition;
    private double salary;

    public Employee() {
    }

    public Employee(ELevelEducation levelEducation, ELevelPosition levelPosition, double salary) {
        this.levelEducation = levelEducation;
        this.levelPosition = levelPosition;
        this.salary = salary;
    }

    public Employee(String code, String name, LocalDate dayOfBirth, String gender, String id, String numberPhone,
                    String email, ELevelEducation levelEducation, ELevelPosition levelPosition, double salary) {
        super(code, name, dayOfBirth, gender, id, numberPhone, email);
        this.levelEducation = levelEducation;
        this.levelPosition = levelPosition;
        this.salary = salary;
    }

    public ELevelEducation getLevelEducation() {
        return levelEducation;
    }

    public void setLevelEducation(ELevelEducation levelEducation) {
        this.levelEducation = levelEducation;
    }

    public ELevelPosition getLevelPosition() {
        return levelPosition;
    }

    public void setLevelPosition(ELevelPosition levelPosition) {
        this.levelPosition = levelPosition;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "levelEducation=" + levelEducation +
                ", levelPosition=" + levelPosition +
                ", salary=" + salary +
                '}';
    }

    public String getInForCsv() {
        return super.getInForCsv() + "," + this.levelEducation + "," + this.levelPosition + "," + this.salary;
    }
}
