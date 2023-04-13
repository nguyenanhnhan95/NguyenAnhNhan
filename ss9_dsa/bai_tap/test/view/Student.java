package ss9_dsa.bai_tap.test.view;
import ss9_dsa.bai_tap.test.service.IStudent;
import ss9_dsa.bai_tap.test.model.Person;
public class Student extends Person implements IStudent {
    public Student(String name, String email) {
        super(name, email);
    }

    @Override
    public void doSth() {

    }

    @Override
    public void study() {
        System.out.println("Đang học bài tính trừu tượng");
    }
}

