package ss19_case_study_module2.service;

import ss19_case_study_module2.model.Facility;
import ss19_case_study_module2.model.House;
import ss19_case_study_module2.model.Room;
import ss19_case_study_module2.model.Villa;
import ss19_case_study_module2.repository.FacilityRepository;
import ss19_case_study_module2.utils.ERentalType;
import ss19_case_study_module2.utils.EServiceFree;
import ss19_case_study_module2.utils.EStandard;
import ss19_case_study_module2.utils.RegexFurama;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityService implements IFacilityService {
    private Scanner sc = new Scanner(System.in);
    private RegexFurama regexFurama = new RegexFurama();
    private FacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void display() {
        Map<Facility, Integer> mapFacility = new LinkedHashMap<>();
        mapFacility = facilityRepository.getMapFacility();
        Set<Facility> facilitySet = mapFacility.keySet();
        System.out.println("+----------------+------------------+-------------+---------------+------------+---------------+" +
                "---------------+---------------+-------------+------------+---------+");
        System.out.println("| Code Service   | Name Service     |    Area     | Cost Rental   |   People   | Type Rental   |" +
                "  Standard     |   Pool        |   Floors    |   Free     |  Status |");
        for (Facility f : facilitySet) {
            System.out.println("+----------------+------------------+-------------+---------------+------------+---------------+" +
                    "---------------+---------------+-------------+------------+---------+");
            if (f instanceof Room) {
                System.out.printf("|%-16s|%-18s|%13s|%15s|%12s|%-15s|%-15s|%15s|%13s|%-12s|%9s|\n",
                        f.getIdService(), f.getNameService(), f.getAreUse(), f.getPriceTax(), f.getNumberPerson(), f.getTypeRental(),
                        "No", "No", "No", ((Room) f).getServiceFree(), mapFacility.get(f));
            } else if (f instanceof House) {
                System.out.printf("|%-16s|%-18s|%13s|%15s|%12s|%-15s|%-15s|%15s|%13s|%-12s|%9s|\n",
                        f.getIdService(), f.getNameService(), f.getAreUse(), f.getPriceTax(), f.getNumberPerson(), f.getTypeRental(),
                        ((House) f).getStandardHouse(), "No", ((House) f).getNumberOfFloors(), "No", mapFacility.get(f));
            } else {
                System.out.printf("|%-16s|%-18s|%13s|%15s|%12s|%-15s|%-15s|%15s|%13s|%-12s|%9s|\n",
                        f.getIdService(), f.getNameService(), f.getAreUse(), f.getPriceTax(), f.getNumberPerson(), f.getTypeRental(),
                        ((Villa) f).getStandardRoom(), ((Villa) f).getAreaPool(), ((Villa) f).getNumberOfFloors(), "No", mapFacility.get(f));
            }
        }
        System.out.println("+----------------+------------------+-------------+---------------+------------+---------------+" +
                "---------------+---------------+-------------+------------+---------+");
    }

    @Override
    public void edit() {

    }

    @Override
    public void displayMaintain() {
        Map<Facility, Integer> mapFacility = new LinkedHashMap<>();
        mapFacility = facilityRepository.getFacilityMaintain();
        Set<Facility> facilitySet = mapFacility.keySet();
        System.out.println("+----------------+------------------+-------------+---------------+------------+---------------+" +
                "---------------+---------------+-------------+------------+---------+");
        System.out.println("| Code Service   | Name Service     |    Area     | Cost Rental   |   People   | Type Rental   |" +
                "  Standard     |   Pool        |   Floors    |   Free     |  Status |");
        for (Facility f : facilitySet) {
            System.out.println("+----------------+------------------+-------------+---------------+------------+---------------+" +
                    "---------------+---------------+-------------+------------+---------+");
            if (f instanceof Room) {
                System.out.printf("|%-16s|%-18s|%13s|%15s|%12s|%-15s|%-15s|%15s|%13s|%-12s|%9s|\n",
                        f.getIdService(), f.getNameService(), f.getAreUse(), f.getPriceTax(), f.getNumberPerson(), f.getTypeRental(),
                        "No", "No", "No", ((Room) f).getServiceFree(), mapFacility.get(f));
            } else if (f instanceof House) {
                System.out.printf("|%-16s|%-18s|%13s|%15s|%12s|%-15s|%-15s|%15s|%13s|%-12s|%9s|\n",
                        f.getIdService(), f.getNameService(), f.getAreUse(), f.getPriceTax(), f.getNumberPerson(), f.getTypeRental(),
                        ((House) f).getStandardHouse(), "No", ((House) f).getNumberOfFloors(), "No", mapFacility.get(f));
            } else {
                System.out.printf("|%-16s|%-18s|%13s|%15s|%12s|%-15s|%-15s|%15s|%13s|%-12s|%9s|\n",
                        f.getIdService(), f.getNameService(), f.getAreUse(), f.getPriceTax(), f.getNumberPerson(), f.getTypeRental(),
                        ((Villa) f).getStandardRoom(), ((Villa) f).getAreaPool(), ((Villa) f).getNumberOfFloors(), "No", mapFacility.get(f));
            }
        }
        System.out.println("+----------------+------------------+-------------+---------------+------------+---------------+" +
                "---------------+---------------+-------------+------------+---------+");
    }

    @Override
    public void addRoom() {
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
                        if (facilityRepository.find(codeService) != -1) {
                            ++count;
                        } else {
                            System.err.println("You enter room existing:");
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
                facilityRepository.add((Facility) new Room(codeService, nameService, Double.parseDouble(areUse),
                        Double.parseDouble(priceRental), Integer.parseInt(numberOfPeople), typeRental, serviceFree), true);
                System.out.println("Completed add :");
                ++count;
            }
        } while (count != 8);
    }

    @Override
    public void addVilla() {
        String codeService = null;
        String nameService = null;
        String areUse = null;
        String priceRental = null;
        String numberOfPeople = null;
        ERentalType typeRental = null;
        EStandard standardVilla = null;
        String areaPool = null;
        String numberOfFloors = null;
        int count = 0;
        do {
            switch (count) {
                case 0:
                    System.out.println("Please enter code service");
                    codeService = sc.nextLine().trim();
                    if (regexFurama.regexCodeVilla(codeService)) {
                        if (facilityRepository.find(codeService) != -1) {
                            ++count;
                        } else {
                            System.err.println("You enter villa existing:");
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
                    System.out.println("Please Villa's area :");
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
                            standardVilla = EStandard.OneStar;
                            ++count;
                            break;
                        case "2":
                            standardVilla = EStandard.TwoStar;
                            ++count;
                            break;
                        case "3":
                            standardVilla = EStandard.ThreeStar;
                            ++count;
                            break;
                        case "4":
                            standardVilla = EStandard.FourStar;
                            ++count;
                            break;
                        case "5":
                            standardVilla = EStandard.FiveStar;
                            ++count;
                            break;
                        default:
                            System.err.println("You enter fault :");
                    }
                case 8:
                    System.out.println("Enter pool area :");
                    areaPool = sc.nextLine().trim();
                    if (regexFurama.regexNumberDouble(areaPool)) {
                        if (Double.parseDouble(areaPool) > 30.0) {
                            ++count;
                        } else {
                            System.err.println("Please pool area greater 30 :");
                        }
                    } else {
                        System.err.println("You enter fault :");
                    }
                    break;
            }
            if (count == 9) {
//                 public Villa(String idService, String nameService, double areUse, double priceTax, int numberPerson, ERentalType typeRental, double areaPool, int standardRoom, int numberOfFloors) {
//                    super(idService, nameService, areUse, priceTax, numberPerson, typeRental);
                facilityRepository.add(new Villa(codeService, nameService, Double.parseDouble(areUse),
                        Double.parseDouble(priceRental), Integer.parseInt(numberOfPeople), typeRental,
                        Double.parseDouble(areaPool), standardVilla, Integer.parseInt(numberOfFloors)), true);
                System.out.println("Completed add");
                ++count;
            }
        } while (count != 10);
    }

    @Override
    public void addHouse() {
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
                        if (facilityRepository.find(codeService) != -1) {
                            ++count;
                        } else {
                            System.err.println("You enter house existing:");
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
                facilityRepository.add(new House(codeService, nameService, Double.parseDouble(areUse),
                        Double.parseDouble(priceRental), Integer.parseInt(numberOfPeople), typeRental,
                        standardHouse, Integer.parseInt(numberOfFloors)), true);
                ++count;
            }
        } while (count != 9);
    }
}
