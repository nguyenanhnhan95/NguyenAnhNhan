package ss19_case_study_module2.controller;

import java.util.Scanner;

public class FuramaController {
    private Scanner sc = new Scanner(System.in);

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
                    manageEmployee();
                    break;
                case "2":
                    manageCustomer();
                    break;
                case "3":
                    manageFacility();
                    break;
                case "4":
                    manageBooking();
                    break;
                case "5":
                    managePromotion();
                    break;
                case "6":
                    System.exit(0);
                default:
                    System.out.println("you entered the wrong syntax");
            }
        } while (true);
    }

    public void manageEmployee() {
        String choice;
        do {
            System.out.println("1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu\n" +
                    "Enter your choice\n");
            choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    displayMainMenu();
                default:
                    System.out.println("you entered the wrong syntax");
            }
        } while (true);
    }

    public void manageCustomer() {
        String choice;
        do {
            System.out.println("1. Display list customres\n" +
                    "2. Add new customers\n" +
                    "3. Edit customer\n" +
                    "4.Return main menu\n");
            choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    System.exit(0);
                case "4":
                    displayMainMenu();
                default:
                    System.out.println("you entered the wrong syntax");
            }
        } while (true);
    }

    public void manageFacility() {
        String choice;
        do {
            System.out.println("1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu\n" +
                    "Enter your choice\n");
            choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    displayMainMenu();
                default:
                    System.out.println("you entered the wrong syntax");
            }
        } while (true);
    }

    public void manageBooking() {
        String choice;
        do {
            System.out.println("1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu\n" +
                    "Please enter your choice");
            choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    displayMainMenu();
                default:
                    System.out.println("you entered the wrong syntax");
            }
        } while (true);
    }

    public void managePromotion() {
        String choice;
        do {
            System.out.println("1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu\n" +
                    "Please enter your choice");
            choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    displayMainMenu();
                default:
                    System.out.println("you entered the wrong syntax");
            }
        } while (true);
    }
}

