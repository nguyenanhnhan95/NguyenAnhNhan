package ss19_case_study_module2.controller;
import ss19_case_study_module2.view.MainFurama;
import java.util.Scanner;

public class CustomerManagement {
    private Scanner sc =new Scanner(System.in);
    public void manageCustomer() {
        String choiceCustomer;
        do {
            System.out.println("1. Display list customres\n" +
                    "2. Add new customers\n" +
                    "3. Edit customer\n" +
                    "4.Return main menu\n");
            choiceCustomer = sc.nextLine().trim();
            switch (choiceCustomer) {
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
        } while (!choiceCustomer.equals("4"));
    }
}
