package ss19_case_study_module2.controller;

import ss19_case_study_module2.view.MainFurama;
import java.util.Scanner;

public class EmployeeManagement {
    private Scanner sc = new Scanner(System.in);
    public void manageEmployee() {
        String choiceEmployee;
        do {
            System.out.println("1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu\n" +
                    "Enter your choice\n");
            choiceEmployee = sc.nextLine().trim();
            switch (choiceEmployee) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.out.println("you entered the wrong syntax");
            }
        } while (!choiceEmployee.equals("4"));
    }
}
