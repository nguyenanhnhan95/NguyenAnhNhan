package ss19_case_study_module2.repository;

import ss19_case_study_module2.model.House;
import ss19_case_study_module2.model.Room;
import ss19_case_study_module2.model.Villa;
import ss19_case_study_module2.utils.ERentalType;
import ss19_case_study_module2.utils.EStandard;
import ss19_case_study_module2.utils.ReadWriteFile;
import ss19_case_study_module2.utils.RegexFurama;

import java.util.*;

public class HouseRepository implements IHouseRepository {
    private ReadWriteFile readWriteFile = new ReadWriteFile();
    private static final String PATH_FACILITY = "D:\\Codegym\\Module2\\src\\ss19_case_study_module2\\data\\facility.csv";
    private RegexFurama regexFurama = new RegexFurama();
    private List<House> houseList;
    private Map<House,Integer> mapHouse;

    @Override
    public int find(String id) {
        mapHouse=new LinkedHashMap<>();
        mapHouse=getList();
        Set<House> house = mapHouse.keySet();
        for (House h: house) {
            if(h.getIdService().equals(id)){
                return -1;
            }
        }
        return 0;
    }

    @Override
    public void add(House house, boolean option) {
        readWriteFile.writeFile(house.getInForCsv()+",0",PATH_FACILITY,option );
    }

    @Override
    public void edit(House house) {

    }


    @Override
    public Map<House,Integer> getList() {
        mapHouse =new LinkedHashMap<>();
        List<String> houseStrList = new ArrayList<>();
        houseStrList = readWriteFile.readFile(PATH_FACILITY);
        String[] arrayHouse;
        houseList = new ArrayList<>();
        for (String h : houseStrList) {
            arrayHouse = h.split(",");
            if (regexFurama.regexCodeHouse(arrayHouse[0])) {
                mapHouse.put(new House(arrayHouse[0], arrayHouse[1], Double.parseDouble(arrayHouse[2]), Double.parseDouble(arrayHouse[3])
                        , Integer.parseInt(arrayHouse[4]), ERentalType.valueOf(arrayHouse[5]),
                        EStandard.valueOf(arrayHouse[6]), Integer.parseInt(arrayHouse[7])),Integer.parseInt(arrayHouse[8]));
            }
        }
        return mapHouse;
    }

}
