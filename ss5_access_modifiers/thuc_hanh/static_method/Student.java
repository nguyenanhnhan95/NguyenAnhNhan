package ss5_access_modifiers.thuc_hanh.static_method;

public class Student {
    private int id;
    private String name;
    private static String college = "BKDN";

    Student(int i, String a) {
        id = i;
        name = a;
    }

    static void change() {
        college = "KTDN";
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}
