package ss19_case_study_module2.service;

import ss19_case_study_module2.model.Villa;
import ss19_case_study_module2.repository.VillaRepository;
import ss19_case_study_module2.utils.ERentalType;
import ss19_case_study_module2.utils.EStandard;
import ss19_case_study_module2.utils.RegexFurama;

import java.util.*;

public class VillaService implements IVillaService {
    private Scanner sc = new Scanner(System.in);
    private VillaRepository villaRepository = new VillaRepository();
    private RegexFurama regexFurama = new RegexFurama();

    @Override
    public void add() {
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
                        if (villaRepository.find(codeService) != -1) {
                            ++count;
                        } else {
                            System.err.println("You enter room existing:");
                            count = 11;
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
                villaRepository.add(new Villa(codeService, nameService, Double.parseDouble(areUse),
                        Double.parseDouble(priceRental), Integer.parseInt(numberOfPeople), typeRental,
                        Double.parseDouble(areaPool), standardVilla, Integer.parseInt(numberOfFloors)), true);
                System.out.println("Completed add");
                ++count;
            }
        } while (count != 10);
    }

    @Override
    public void display() {
        Map<Villa, Integer> mapVilla = new LinkedHashMap<>();
        mapVilla = villaRepository.getList();
        Set<Villa> villaSet = mapVilla.keySet();
        for (Villa v : villaSet) {
            System.out.println("+----------------+------------------+-------------+---------------+------------+---------------+" +
                    "---------------+---------------+-------------+------------+---------+");
            System.out.printf("|%-16s|%-18s|%13s|%15s|%12s|%-15s|%-15s|%-15s|%-13s|%-12s|%-9s|\n",
                    v.getIdService(), v.getNameService(), v.getAreUse(), v.getPriceTax(), v.getNumberPerson(), v.getTypeRental(),
                    v.getStandardRoom(), v.getAreaPool(), v.getNumberOfFloors(), "No", mapVilla.get(v));
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void diplayMaintainVilla() {
        Map<Villa, Integer> mapVilla = new LinkedHashMap<>();
        mapVilla = villaRepository.getList();
        Set<Villa> villaSet = mapVilla.keySet();
        for (Villa v : villaSet) {
            if (mapVilla.get(v) == 5) {
                System.out.println("+----------------+------------------+-------------+---------------+------------+---------------+" +
                        "---------------+---------------+-------------+------------+---------+");
                System.out.printf("|%-16s|%-18s|%13s|%15s|%12s|%-15s|%-15s|%-15s|%-13s|%-12s|%-9s|\n",
                        v.getIdService(), v.getNameService(), v.getAreUse(), v.getPriceTax(), v.getNumberPerson(), v.getTypeRental(),
                        v.getStandardRoom(), v.getAreaPool(), v.getNumberOfFloors(), "No", mapVilla.get(v));
            }
        }
    }
}
