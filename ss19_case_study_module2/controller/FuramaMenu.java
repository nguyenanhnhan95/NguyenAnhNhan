package ss19_case_study_module2.controller;
import ss19_case_study_module2.view.MainFurama;
import java.util.Scanner;

public class FuramaMenu {
    private Scanner sc = new Scanner(System.in);
    private EmployeeManagement employeeManagement = new EmployeeManagement();
    private CustomerManagement customerManagement= new CustomerManagement();
    private FacilityManagement facilityManagement = new FacilityManagement();
    private PromotionManagement promotionManagement = new PromotionManagement();
    private BookManagement bookManagement =new BookManagement();
    public void displayMainMenu() {
        String choice;
        do {
            System.out.println("1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Mangament\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Managemtn\n" +
                    "6. Exit\n" +
                    "Please your choice enter");
            choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    employeeManagement.manageEmployee();
                    break;
                case "2":
                    customerManagement.manageCustomer();
                    break;
                case "3":
                    facilityManagement.manageFacility();
                    break;
                case "4":
                    bookManagement.manageBooking();
                    break;
                case "5":
                    promotionManagement.managePromotion();
                    break;
                case "6":
                    System.exit(0);
                default:
                    System.out.println("you entered the wrong syntax");
            }
        } while (true);
    }
}

