package ss19_case_study_module2.repository;

import ss19_case_study_module2.model.Facility;
import ss19_case_study_module2.model.House;
import ss19_case_study_module2.model.Room;
import ss19_case_study_module2.model.Villa;
import ss19_case_study_module2.utils.ReadWriteFile;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static final String PATH_FACILITY="D:\\Codegym\\Module2\\src\\ss19_case_study_module2\\data\\facility.csv";
    private ReadWriteFile readWriteFile = new ReadWriteFile();

    @Override
    public int find(String id) {
        return 0;
    }


    @Override
    public void add(Facility facility, boolean option) {

    }

    @Override
    public void edit(Facility facility) {

    }

    @Override
    public Map<House, Integer> getMapHouse() {
        return null;
    }

    @Override
    public Map<Room, Integer> getMapRoom() {
        return null;
    }

    @Override
    public Map<Villa, Integer> getMapVilla() {
        return null;
    }
}
