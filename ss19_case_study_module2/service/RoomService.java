package ss19_case_study_module2.service;

import ss19_case_study_module2.model.Room;
import ss19_case_study_module2.repository.RoomRepository;
import ss19_case_study_module2.utils.ERentalType;
import ss19_case_study_module2.utils.EServiceFree;
import ss19_case_study_module2.utils.RegexFurama;

import java.util.*;

public class RoomService implements IRoomService {
    private Scanner sc = new Scanner(System.in);
    private RegexFurama regexFurama = new RegexFurama();
    private RoomRepository roomRepository = new RoomRepository();

    @Override
    public void add() {
        String codeService = null;
        String nameService = null;
        String areUse = null;
        String priceRental = null;
        String numberOfPeople = null;
        ERentalType typeRental = null;
        EServiceFree serviceFree = null;
        int count = 0;
        do {
            switch (count) {
                case 0:
                    System.out.println("Please enter code service");
                    codeService = sc.nextLine().trim();
                    if (regexFurama.regexCodeRoom(codeService)) {
                        if (roomRepository.find(codeService) != -1) {
                            ++count;
                        } else {
                            System.err.println("You enter room existing:");
                            count = 9;
                        }
                    } else {
                        System.err.println("You enter fault :");
                    }
                    break;
                case 1:
                    System.out.println("Please enter name service :");
                    nameService = sc.nextLine().trim();
                    if (regexFurama.regexCodeService(nameService)) {
                        ++count;
                    } else {
                        System.err.println("You enter fault :");
                    }
                    break;
                case 2:
                    System.out.println("Please room's area :");
                    areUse = sc.nextLine().trim();
                    if (regexFurama.regexNumberDouble(areUse)) {
                        ++count;
                    } else {
                        System.err.println("Enter area fault :");
                    }
                    break;
                case 3:
                    System.out.println("Please enter cost rental :");
                    priceRental = sc.nextLine().trim();
                    if (regexFurama.regexNumberDouble(priceRental)) {
                        ++count;
                    } else {
                        System.err.println("Enter cost rental fault :");
                    }
                    break;
                case 4:
                    System.out.println("Please number of people :");
                    numberOfPeople = sc.nextLine().trim();
                    if (regexFurama.regexNumberInt(numberOfPeople)) {
                        ++count;
                    } else {
                        System.err.println("Enter number of people fault :");
                    }
                    break;
                case 5:
                    System.out.println("1. House\n" +
                            "2. Day\n" +
                            "3. Month\n" +
                            "4. Years\n" +
                            "Please enter your choice :");
                    switch (sc.nextLine().trim()) {
                        case "1":
                            typeRental = ERentalType.Hour;
                            ++count;
                            System.out.println("Completed");
                            break;
                        case "2":
                            typeRental = ERentalType.Day;
                            ++count;
                            System.out.println("Completed");
                            break;
                        case "3":
                            typeRental = ERentalType.Month;
                            ++count;
                            System.out.println("Completed");
                            break;
                        case "4":
                            typeRental = ERentalType.Year;
                            ++count;
                            System.out.println("Completed");
                            break;
                        default:
                            System.err.println("You enter fault :");
                    }
                    break;
                case 6:
                    System.out.println("Please enter service free :");
                    System.out.println("1. Wifi\n" +
                            "2. Coffe\n");
                    switch (sc.nextLine().trim()) {
                        case "1":
                            serviceFree = EServiceFree.Wifi;
                            ++count;
                            break;
                        case "2":
                            serviceFree = EServiceFree.Coffee;
                            ++count;
                            break;
                        case "3":
                        default:
                            System.err.println("You enter fault :");
                    }
                    break;
            }
            if (count == 7) {
                roomRepository.add(new Room(codeService, nameService, Double.parseDouble(areUse),
                        Double.parseDouble(priceRental), Integer.parseInt(numberOfPeople), typeRental, serviceFree), true);
                System.out.println("Completed add :");
                ++count;
            }
        } while (count != 8);
    }

    @Override
    public void display() {
        Map<Room, Integer> mapRoom = new LinkedHashMap<>();
        mapRoom = roomRepository.getList();
        Set<Room> roomSet = mapRoom.keySet();
        for (Room r : roomSet) {
            System.out.println("+----------------+------------------+-------------+---------------+------------+---------------+" +
                    "---------------+---------------+-------------+------------+---------+");
            System.out.printf("|%-16s|%-18s|%13s|%15s|%12s|%-15s|%-15s|%-15s|%-13s|%-12s|%-9s|\n",
                    r.getIdService(), r.getNameService(), r.getAreUse(), r.getPriceTax(), r.getNumberPerson(), r.getTypeRental(),
                    "No", "No", "No", r.getServiceFree(), mapRoom.get(r));
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void displayRoomMaintain() {
        Map<Room, Integer> mapRoom = new LinkedHashMap<>();
        mapRoom = roomRepository.getList();
        Set<Room> roomSet = mapRoom.keySet();
        for (Room r : roomSet) {
            if (mapRoom.get(r) == 5) {
                System.out.println("+----------------+------------------+-------------+---------------+------------+---------------+" +
                        "---------------+---------------+-------------+------------+---------+");
                System.out.printf("|%-16s|%-18s|%13s|%15s|%12s|%-15s|%-15s|%-15s|%-13s|%-12s|%-9s|\n",
                        r.getIdService(), r.getNameService(), r.getAreUse(), r.getPriceTax(), r.getNumberPerson(), r.getTypeRental(),
                        "No", "No", "No", r.getServiceFree(), mapRoom.get(r));
            }
        }
    }
}
