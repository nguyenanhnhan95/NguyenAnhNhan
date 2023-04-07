package ss5_access_modifiers.bai_tap.student;

public class Test {
    public static void main(String[] args) {
        Student studentOne = new Student();
        studentOne.setName("Nhan");
        studentOne.setClasses("Co3");
        System.out.println(studentOne.getName() + studentOne.getClasses());
    }
}
