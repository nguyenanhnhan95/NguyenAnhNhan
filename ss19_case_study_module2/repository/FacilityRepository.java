package ss19_case_study_module2.repository;

import ss19_case_study_module2.model.Facility;
import ss19_case_study_module2.model.House;
import ss19_case_study_module2.model.Room;
import ss19_case_study_module2.model.Villa;
import ss19_case_study_module2.utils.*;

import java.util.*;

public class FacilityRepository implements IFacilityRepository {
    private static final String PATH_FACILITY = "D:\\Codegym\\Module2\\src\\ss19_case_study_module2\\data\\facility.csv";
    private ReadWriteFile readWriteFile = new ReadWriteFile();
    private RegexFurama regexFurama = new RegexFurama();
    private Map<Facility, Integer> mapFacility;

    @Override
    public int find(String id) {
        mapFacility = new LinkedHashMap<>();
        mapFacility = getMapFacility();
        Set<Facility> facilitySet = mapFacility.keySet();
        for (Facility f : facilitySet) {
            if (f.getIdService().equals(id)) {
                return -1;
            }
        }
        return 0;
    }


    @Override
    public void add(Facility facility, boolean option) {
        if (facility instanceof Room) {
            Room room = (Room) facility;
            readWriteFile.writeFile(room.getInForCsv() + ",0", PATH_FACILITY, option);
        } else if (facility instanceof House) {
            House house = (House) facility;
            readWriteFile.writeFile(house.getInForCsv() + ",0", PATH_FACILITY, option);
        } else {
            Villa villa = (Villa) facility;
            readWriteFile.writeFile(villa.getInForCsv() + ",0", PATH_FACILITY, option);
        }
    }

    @Override
    public void edit(Facility facility) {
        mapFacility = new LinkedHashMap<>();
        String writeFile = "";
        mapFacility = getMapFacility();
        mapFacility.put(facility, mapFacility.get(facility) + 1);
        Set<Facility> facilitySet = mapFacility.keySet();
        for (Facility f : facilitySet) {
            if (f instanceof Room) {
                writeFile += ((Room) f).getInForCsv() + "," + mapFacility.get(f) + "\n";
            } else if (f instanceof House) {
                writeFile += ((House) f).getInForCsv() + "," + mapFacility.get(f) + "\n";
            } else {
                writeFile += ((Villa) f).getInForCsv() + "," + mapFacility.get(f) + "\n";
            }
        }
        readWriteFile.writeFile(writeFile, PATH_FACILITY, false);
    }

    @Override
    public Map<Facility, Integer> getMapFacility() {
        mapFacility = new LinkedHashMap<>();
        List<String> facilityList = new ArrayList<>();
        facilityList = readWriteFile.readFile(PATH_FACILITY);
        String[] arrayFacility;
        for (String f : facilityList) {
            arrayFacility = f.split(",");
            if (regexFurama.regexCodeRoom(arrayFacility[0])) {
                mapFacility.put(new Room(arrayFacility[0], arrayFacility[1], Double.parseDouble(arrayFacility[2]),
                                Double.parseDouble(arrayFacility[3]), Integer.parseInt(arrayFacility[4]),
                                ERentalType.valueOf(arrayFacility[5]), EServiceFree.valueOf(arrayFacility[6])),
                        Integer.parseInt(arrayFacility[7]));
            }
            if (regexFurama.regexCodeVilla(arrayFacility[0])) {
                mapFacility.put(new Villa(arrayFacility[0], arrayFacility[1], Double.parseDouble(arrayFacility[2]),
                                Double.parseDouble(arrayFacility[3]), Integer.parseInt(arrayFacility[4]),
                                ERentalType.valueOf(arrayFacility[5]), Double.parseDouble(arrayFacility[6]),
                                EStandard.valueOf(arrayFacility[7]), Integer.parseInt(arrayFacility[8])),
                        Integer.parseInt(arrayFacility[9]));
            }
            if (regexFurama.regexCodeHouse(arrayFacility[0])) {
                mapFacility.put(new House(arrayFacility[0], arrayFacility[1], Double.parseDouble(arrayFacility[2]),
                        Double.parseDouble(arrayFacility[3]), Integer.parseInt(arrayFacility[4]),
                        ERentalType.valueOf(arrayFacility[5]), EStandard.valueOf(arrayFacility[6]),
                        Integer.parseInt(arrayFacility[7])), Integer.parseInt(arrayFacility[8]));
            }
        }
        return mapFacility;
    }

    @Override
    public Facility finFacility(String id) {
        mapFacility = new LinkedHashMap<>();
        mapFacility = getMapFacility();
        Set<Facility> facilitySet = mapFacility.keySet();
        for (Facility f : facilitySet) {
            if (f.getIdService().equals(id)) {
                return f;
            }
        }
        return null;
    }

    @Override
    public Map<Facility, Integer> getFacilityMaintain() {
        mapFacility = new LinkedHashMap<>();
        Map<Facility, Integer> mapFacilityMaintain = new LinkedHashMap<>();
        mapFacility = getMapFacility();
        Set<Facility> facilitySet = mapFacility.keySet();
        for (Facility f : facilitySet) {
            if (mapFacility.get(f) == 5) {
                mapFacilityMaintain.put(f, 5);
            }
        }
        return mapFacilityMaintain;
    }
}
