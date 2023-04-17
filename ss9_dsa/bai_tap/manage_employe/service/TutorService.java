package ss9_dsa.bai_tap.manage_employe.service;

import ss9_dsa.bai_tap.manage_employe.model.Tutor;
import ss9_dsa.bai_tap.manage_employe.responsitory.TutorResponsitory;

import java.util.List;
import java.util.Scanner;

public class TutorService implements ICoGymService {
    private TutorResponsitory tutorRepository = new TutorResponsitory();
    private Scanner sc = new Scanner(System.in);

    @Override
    public List<Tutor> getList() {
        return tutorRepository.getList();
    }

    @Override
    public void add() {
//        public Tutor(String id, String name, String date, String gender, String specialize) {
        System.out.println("Enter id :");
        String id = sc.nextLine();
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter date");
        String date = sc.nextLine();
        System.out.println("Enter gender");
        String gender = sc.nextLine();
        System.out.println("Enter Specialize");
        String specialize = sc.nextLine();
        Tutor tutor = new Tutor(id, name, date, gender, specialize);
        tutorRepository.add(tutor);
    }

    @Override
    public String delete() {
        System.out.println("Enter id muốn xóa :");
        String id = sc.nextLine();
        int size = tutorRepository.getList().size();
        for (int i = 0; i < size; i++) {
            if (tutorRepository.getList().get(i).getId().equals(id)) {
                tutorRepository.delete(i);
                return "Xóa thành công";
            }
        }
        return "Không tồn tại";
    }

    @Override
    public void displayList() {
        System.out.printf("--------------------------------------------------------%n");
        System.out.printf("| ID |         Name   |BirthOfDay | Gender| Specialize |%n");
        System.out.printf("|------------------------------------------------------|%n");
        for (Tutor tutors : tutorRepository.getList()) {
            System.out.printf("| %-2s | %-15s| %-10s| %-6s|%-12s|", tutors.getId(), tutors.getName(), tutors.getDate(), tutors.getGender(), tutors.getSpecialize());
            System.out.println("");
        }
        System.out.printf("--------------------------------------------------------%n");
    }
}
