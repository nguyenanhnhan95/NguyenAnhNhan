package ss9_dsa.bai_tap.manage_employe.controller;

import ss9_dsa.bai_tap.manage_employe.service.StudentService;
import ss9_dsa.bai_tap.manage_employe.service.TutorService;

import java.util.Scanner;

public class MenuCodeGym {
    Scanner sc = new Scanner(System.in);
    boolean flag;
    StudentService studentService = new StudentService();
    TutorService tutorService = new TutorService();

    public void Selection() {
        flag = true;
        do {
            System.out.println("Chương Trình Quản Lý Sinh Viên--\n" +
                    "Chọn chức năng theo số ( để tiếp tục):\n" +
                    "1.Quản lý sinh viên.\n" +
                    "2.Quản lý tutor\n" +
                    "3.Thoát \n" +
                    "Mời bạn nhập sự lựa chọn.\n");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    manageStudent();
                    break;
                case "2":
                    manageTutor();
                    break;
                case "3":
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn nhập sai cú pháp");
            }
        } while (flag);
    }

    public void manageStudent() {
        do {
            System.out.println("Chương Trình Quản Lý Học Viên--\n" +
                    "Chọn chức năng theo số ( để tiếp tục):\n" +
                    "1.Thêm mới học viên.\n" +
                    "2.Xóa học viên\n" +
                    "3.Xem danh sách học viên \n" +
                    "4.Quay lại \n" +
                    "5.Thoát \n" +
                    "Mời bạn nhập sự lựa chọn.");
            String choiceStudent = sc.nextLine();
            switch (choiceStudent) {
                case "1":
                    studentService.add();
                    break;
                case "2":
                    System.out.println(studentService.delete());
                    break;
                case "3":
                    studentService.displayList();
                    break;
                case "4":
                    flag = false;
                    Selection();
                    break;
                case "5":
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn nhập sai cú pháp");
            }
        } while (flag);
    }

    public void manageTutor() {
        do {
            System.out.println("Chương Trình Quản Lý Tutor--\n" +
                    "Chọn chức năng theo số ( để tiếp tục):\n" +
                    "1.Thêm mới tutor.\n" +
                    "2.Xóa tutor\n" +
                    "3.Xem danh sách tutor \n" +
                    "4.Quay lại \n" +
                    "5.Thoát \n" +
                    "Mời bạn nhập sự lựa chọn.");
            String choiceTutor = sc.nextLine();
            switch (choiceTutor) {
                case "1":
                    tutorService.add();
                    break;
                case "2":
                    System.out.println(tutorService.delete());
                    ;
                    break;
                case "3":
                    tutorService.displayList();
                    break;
                case "4":
                    flag = false;
                    Selection();
                    break;
                case "5":
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn nhập sai cú pháp");
            }
        } while (flag);
    }
}
