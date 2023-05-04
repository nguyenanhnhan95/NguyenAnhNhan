package ss19_case_study_module2.service;

import ss19_case_study_module2.model.House;
import ss19_case_study_module2.repository.HouseRepository;
import ss19_case_study_module2.utils.ERentalType;
import ss19_case_study_module2.utils.EStandard;
import ss19_case_study_module2.utils.RegexFurama;

import java.util.*;

public class HouseService implements IHouseService {
    private Scanner sc = new Scanner(System.in);
    private RegexFurama regexFurama = new RegexFurama();
    private HouseRepository houseRepository = new HouseRepository();
    private Map<House, Integer> mapHouse;

    @Override
    public void add() {
        String codeService = null;
        String nameService = null;
        String areUse = null;
        String priceRental = null;
        String numberOfPeople = null;
        ERentalType typeRental = null;
        EStandard standardHouse = null;
        String numberOfFloors = null;
        int count = 0;
        do {
            switch (count) {
                case 0:
                    System.out.println("Please enter code service");
                    codeService = sc.nextLine().trim();
                    if (regexFurama.regexCodeHouse(codeService)) {
                        if (houseRepository.find(codeService) != -1) {
                            ++count;
                        } else {
                            System.err.println("You enter house existing:");
                            count = 10;
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
                    System.out.println("Please House's area :");
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
                    System.out.println("Please enter number of floors :");
                    numberOfFloors = sc.nextLine().trim();
                    if (regexFurama.regexNumberInt(numberOfFloors)) {
                        ++count;
                    } else {
                        System.err.println("You enter fault :");
                    }
                    break;
                case 7:
                    System.out.println("1. One Star\n" +
                            "2. Two Star\n" +
                            "3. Three Star\n" +
                            "4 Four Star\n" +
                            "5. Five Star\n" +
                            "Enter house's standard :");
                    switch (sc.nextLine().trim()) {
                        case "1":
                            standardHouse = EStandard.OneStar;
                            ++count;
                            break;
                        case "2":
                            standardHouse = EStandard.TwoStar;
                            ++count;
                            break;
                        case "3":
                            standardHouse = EStandard.ThreeStar;
                            ++count;
                            break;
                        case "4":
                            standardHouse = EStandard.FourStar;
                            ++count;
                            break;
                        case "5":
                            standardHouse = EStandard.FiveStar;
                            ++count;
                            break;
                        default:
                            System.err.println("You enter fault :");
                    }
                    break;
            }
            if (count == 8) {
//               houseRepository.add(Map<new House(codeService, nameService, Double.parseDouble(areUse),
//                       Double.parseDouble(priceRental), Integer.parseInt(numberOfPeople), typeRental,
//                       standardHouse, Integer.parseInt(numberOfFloors)),Integer.parseInt(useCount))>);
                houseRepository.add(new House(codeService, nameService, Double.parseDouble(areUse),
                        Double.parseDouble(priceRental), Integer.parseInt(numberOfPeople), typeRental,
                        standardHouse, Integer.parseInt(numberOfFloors)), true);
                ++count;
            }
        } while (count != 9);
    }

    @Override
    public void display() {
        mapHouse = new LinkedHashMap<>();
        mapHouse = houseRepository.getList();
        Set<House> set = mapHouse.keySet();
        for (House h : set) {
            System.out.println("+----------------+------------------+-------------+---------------+------------+---------------+" +
                    "---------------+---------------+-------------+------------+---------+");
            System.out.printf("|%-16s|%-18s|%13s|%15s|%12s|%-15s|%-15s|%-15s|%-13s|%-12s|%-9s|\n",
                    h.getIdService(), h.getNameService(), h.getAreUse(), h.getPriceTax(), h.getNumberPerson(), h.getTypeRental(),
                    h.getStandardHouse(), "No", h.getNumberOfFloors(), "No", mapHouse.get(h));
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void displayMaintainHouse() {
        mapHouse = new LinkedHashMap<>();
        mapHouse = houseRepository.getList();
        Set<House> set = mapHouse.keySet();
        for (House h : set) {
            if (mapHouse.get(h) == 5) {
                System.out.println("+----------------+------------------+-------------+---------------+------------+---------------+" +
                        "---------------+---------------+-------------+------------+---------+");
                System.out.printf("|%-16s|%-18s|%13s|%15s|%12s|%-15s|%-15s|%-15s|%-13s|%-12s|%-9s|\n",
                        h.getIdService(), h.getNameService(), h.getAreUse(), h.getPriceTax(), h.getNumberPerson(), h.getTypeRental(),
                        h.getStandardHouse(), "No", h.getNumberOfFloors(), "No", mapHouse.get(h));
            }
        }
    }
}
