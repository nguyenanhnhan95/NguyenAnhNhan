package ss5_access_modifiers.bai_tap.student;

public class Student {
    private String name = "John";
    private String classes = "Co2";

    Student() {

    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
