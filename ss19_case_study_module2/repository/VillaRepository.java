package ss19_case_study_module2.repository;

import ss19_case_study_module2.model.House;
import ss19_case_study_module2.model.Room;
import ss19_case_study_module2.model.Villa;
import ss19_case_study_module2.utils.*;

import java.util.*;

public class VillaRepository implements IVillaRepository {
    private ReadWriteFile readWriteFile = new ReadWriteFile();
    private RegexFurama regexFurama = new RegexFurama();
    private static final String PATH_FACILITY = "D:\\Codegym\\Module2\\src\\ss19_case_study_module2\\data\\facility.csv";
    private Map<Villa ,Integer> mapVilla;

    @Override
    public int find(String id) {
        mapVilla=new LinkedHashMap<>();
        mapVilla=getList();
        Set<Villa> villaSet = mapVilla.keySet();
        for (Villa v:villaSet) {
            if(v.getIdService().equals(id)){
                return -1;
            }
        }
        return 0;
    }

    @Override
    public Map<Villa,Integer> getList() {
        List<String> villaStrList = new ArrayList<>();
        mapVilla=new LinkedHashMap<>();
        villaStrList = readWriteFile.readFile(PATH_FACILITY);
        String[] arrayVilla;
        for (String v : villaStrList) {
            arrayVilla = v.split(",");
            if (regexFurama.regexCodeVilla(arrayVilla[0])) {
                mapVilla.put(new Villa(arrayVilla[0], arrayVilla[1], Double.parseDouble(arrayVilla[2]), Double.parseDouble(arrayVilla[3])
                        , Integer.parseInt(arrayVilla[4]), ERentalType.valueOf(arrayVilla[5]), Double.parseDouble(arrayVilla[6]),
                        EStandard.valueOf(arrayVilla[7]), Integer.parseInt(arrayVilla[8])),Integer.parseInt(arrayVilla[9]));
            }
        }
        return mapVilla;
    }

    @Override
    public void add(Villa villa, boolean option) {
        readWriteFile.writeFile(villa.getInForCsv()+",0", PATH_FACILITY, option);
    }

    @Override
    public void edit(Villa villa) {

    }
}
