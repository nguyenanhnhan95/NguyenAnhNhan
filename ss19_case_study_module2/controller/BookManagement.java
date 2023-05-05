package ss19_case_study_module2.controller;
import ss19_case_study_module2.service.BookingService;
import ss19_case_study_module2.service.ContractionService;
import java.util.Scanner;

public class BookManagement {
    private Scanner sc = new Scanner(System.in);
    private BookingService bookingService = new BookingService();
    private ContractionService contractionService = new ContractionService();
    public void manageBooking() {
        String choiceBooking;
        do {
            System.out.println("1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu\n" +
                    "Please enter your choice");
            choiceBooking = sc.nextLine().trim();
            switch (choiceBooking) {
                case "1":
                    bookingService.add();
                    break;
                case "2":
                    bookingService.display();
                    break;
                case "3":
                    contractionService.add();
                case "4":
                    contractionService.display();
                    break;
                case "5":
                    contractionService.edit();
                    break;
                case "6":
                    break;
                default:
                    System.out.println("you entered the wrong syntax");
            }
        } while (!choiceBooking.equals("6"));
    }
}
