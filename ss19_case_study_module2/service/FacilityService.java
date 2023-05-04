package ss19_case_study_module2.service;

import ss19_case_study_module2.repository.FacilityRepository;
import ss19_case_study_module2.utils.RegexFurama;

import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private Scanner sc = new Scanner(System.in);
    private RegexFurama regexFurama = new RegexFurama();
    private FacilityRepository facilityRepository = new FacilityRepository();
    private RoomService roomService = new RoomService();
    private HouseService houseService = new HouseService();
    private VillaService villaService = new VillaService();

    @Override
    public void add() {
        boolean flag = true;
        do {
            System.out.println("1. Add New Villa.\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back to menu\n" +
                    "Enter your choice\n");
            switch (sc.nextLine().trim()) {
                case "1":
                    villaService.add();
                    break;
                case "2":
                    houseService.add();
                    break;
                case "3":
                    roomService.add();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("you entered the wrong syntax");
            }
        } while (flag);
    }

    @Override
    public void display() {
        System.out.println("+----------------+------------------+-------------+---------------+------------+---------------+" +
                "---------------+---------------+-------------+------------+---------+");
        System.out.println("| Code Service   | Name Service     |    Area     | Cost Rental   |   People   | Type Rental   |" +
                "  Standard     | Pool          |   Floors    |   Free     |  Status |");
        roomService.display();
        villaService.display();
        houseService.display();
        System.out.println("+----------------+------------------+-------------+---------------+------------+---------------+" +
                "---------------+---------------+-------------+------------+---------+");
    }

    @Override
    public void edit() {

    }

    @Override
    public void displayMaintain() {
        System.out.println("+----------------+------------------+-------------+---------------+------------+---------------+" +
                "---------------+---------------+-------------+------------+---------+");
        System.out.println("| Code Service   | Name Service     |    Area     |  Cost Rental  |   People   | Type Rental   |" +
                "  Standard     |     Pool      |   Floors    |   Free     |  Status |");
        roomService.displayRoomMaintain();
        villaService.diplayMaintainVilla();
        houseService.displayMaintainHouse();
        System.out.println("+----------------+------------------+-------------+---------------+------------+---------------+" +
                "---------------+---------------+-------------+------------+---------+");
    }
}
