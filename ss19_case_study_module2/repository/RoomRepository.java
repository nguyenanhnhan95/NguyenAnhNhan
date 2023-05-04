package ss19_case_study_module2.repository;

import ss19_case_study_module2.model.House;
import ss19_case_study_module2.model.Room;
import ss19_case_study_module2.utils.ERentalType;
import ss19_case_study_module2.utils.EServiceFree;
import ss19_case_study_module2.utils.ReadWriteFile;
import ss19_case_study_module2.utils.RegexFurama;

import java.util.*;

public class RoomRepository implements IRoomRepository{
    private static final String PATH_FACILITY="D:\\Codegym\\Module2\\src\\ss19_case_study_module2\\data\\facility.csv";
    private ReadWriteFile readWriteFile = new ReadWriteFile();
    private RegexFurama regexFurama = new RegexFurama();
    private List<Room> roomList;
    private Map<Room,Integer> roomMap;
    @Override
    public int find(String id) {
        roomMap=new LinkedHashMap<>();
        roomMap=getList();
        Set<Room> rom = roomMap.keySet();
        for (Room r:rom) {
            if(r.getIdService().equals(id)){
                return -1;
            }
        }
        return 0;
    }

    @Override
    public Map<Room,Integer> getList() {
        Map<Room,Integer> mapRoom = new LinkedHashMap<>();
        List<String> roomList = new ArrayList<>();
        roomList = readWriteFile.readFile(PATH_FACILITY);
        String[] arrayRoom;
        for (String r:roomList) {
            arrayRoom=r.split(",");
            if(regexFurama.regexCodeRoom(arrayRoom[0])){
//                public Room(String idService, String nameService, double areUse, double priceTax, int numberPerson, ERentalType typeRental, EServiceFree
//                serviceFree) {
//                    super(idService, nameService, areUse, priceTax, numberPerson, typeRental);
                mapRoom.put(new Room(arrayRoom[0],arrayRoom[1],Double.parseDouble(arrayRoom[2]),Double.parseDouble(arrayRoom[3])
                        ,Integer.parseInt(arrayRoom[4]), ERentalType.valueOf(arrayRoom[5]),EServiceFree.valueOf(arrayRoom[6])),Integer.parseInt(arrayRoom[7]));
            }
        }
        return mapRoom;
    }

    @Override
    public void countUseRoom(String id) {
        String mapString="";
        roomMap=new LinkedHashMap<>();
        roomMap=getList();
        Set<Room> roomSet = roomMap.keySet();
        for (Room r: roomSet) {
            if(r.getIdService().equals(id)){
                roomMap.put(r, roomMap.get(r) + 1);
            }
            mapString+=r.getInForCsv()+","+roomMap.get(r)+"\n";
        }
        readWriteFile.writeFile(mapString,PATH_FACILITY,false);
    }

    @Override
    public void add(Room room, boolean option) {
        readWriteFile.writeFile(room.getInForCsv()+",0",PATH_FACILITY,option);
    }

    @Override
    public void edit(Room room) {

    }

}
