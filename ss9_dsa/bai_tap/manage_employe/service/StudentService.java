package ss9_dsa.bai_tap.manage_employe.service;

import ss9_dsa.bai_tap.manage_employe.model.Study;
import ss9_dsa.bai_tap.manage_employe.respository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentService implements ICoGymService {
    Scanner sc = new Scanner(System.in);
    StudentRepository studentRepository = new StudentRepository();

    @Override
    public List<Study> getList() {
        return studentRepository.getList();
    }

    @Override
    public void add() {
//        public Study(String id, String name, String date, String gender, String classStudy, double point)
        System.out.println("Enter id :");
        String id = sc.nextLine();
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter date");
        String date = sc.nextLine();
        System.out.println("Enter gender");
        String gender = sc.nextLine();
        System.out.println("Enter class");
        String classStudy = sc.nextLine();
        System.out.println("Enter point");
        Double point = Double.parseDouble(sc.nextLine());
        Study study = new Study(id, name, date, gender, classStudy, point);
        studentRepository.add(study);
    }

    @Override
    public String delete() {
        System.out.println("Enter id muốn xóa :");
        String id = sc.nextLine();
        int size = studentRepository.getList().size();
        for (int i = 0; i < size; i++) {
            if (studentRepository.getList().get(i).getId().equals(id)) {
                studentRepository.delete(i);
                return "Xóa thành công";
            }
        }
        return "Không tồn tại";
    }


    @Override
    public void displayList() {
        System.out.printf("----------------------------------------------------------%n");
        System.out.printf("| ID |         Name   |BirthOfDay | Gender| Class | Point |%n");
        System.out.printf("|---------------------------------------------------------|%n");
        for (Study study : studentRepository.getList()) {
            System.out.printf("| %-2s | %-15s| %-10s| %-6s|%-5s|%-7s|", study.getId(), study.getName(), study.getDate(), study.getGender(), study.getClassStudy(), study.getPoint());
            System.out.println("");
        }
        System.out.printf("----------------------------------------------------------%n");
    }
}
