package ss16_io_file_binary.thuc_hanh.read_write_student;

import java.io.Serializable;

public class Student implements Serializable {
    protected static final String PATH = "D:\\Codegym\\Module2\\src\\ss16_io_file_binary\\thuc_hanh\\read_write_student\\data.csv";
    private int id;
    private  String name;
    private String address;
    public Student(){}

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
