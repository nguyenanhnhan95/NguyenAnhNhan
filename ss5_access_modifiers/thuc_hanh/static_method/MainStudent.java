package ss5_access_modifiers.thuc_hanh.static_method;

public class MainStudent {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(106150041, "Nguyen Anh Nhan");
        Student s2 = new Student(106150042, "Nguyen Anh Vũ");
        s1.display();
        s2.display();
    }
}
