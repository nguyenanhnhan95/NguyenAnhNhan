package ss19_case_study_module2.controller;

import ss19_case_study_module2.view.MainFurama;

import java.util.Scanner;

public class PromotionManagement {
    private Scanner sc = new Scanner(System.in);

    public void managePromotion() {
        String choicePromotion;
        do {
            System.out.println("1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu\n" +
                    "Please enter your choice");
            choicePromotion = sc.nextLine().trim();
            switch (choicePromotion) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("you entered the wrong syntax");
            }
        } while (!choicePromotion.equals("3"));
    }
}
