package ss19_case_study_module2.controller;
import ss19_case_study_module2.service.FacilityService;
import ss19_case_study_module2.view.MainFurama;
import java.util.Scanner;

public class FacilityManagement {
    private Scanner sc =new  Scanner(System.in);
    private FacilityService facilityService = new FacilityService();
    public void manageFacility() {
        String choiceFacility;
        do {
            System.out.println("1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu\n" +
                    "Enter your choice\n");
            choiceFacility = sc.nextLine().trim();
            switch (choiceFacility) {
                case "1":
                    facilityService.display();
                    break;
                case "2":
                    menuAddFacility();
                    break;
                case "3":
                    facilityService.displayMaintain();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("you entered the wrong syntax");
            }
        } while (!choiceFacility.equals("4"));
    }
    public void menuAddFacility(){
        boolean flag = true;
        do {
            System.out.println("1. Add New Villa.\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back to menu\n" +
                    "Enter your choice\n");
            switch (sc.nextLine().trim()) {
                case "1":
                    facilityService.addVilla();
                    break;
                case "2":
                    facilityService.addHouse();
                    break;
                case "3":
                    facilityService.addRoom();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("you entered the wrong syntax");
            }
        } while (flag);
    }
}
