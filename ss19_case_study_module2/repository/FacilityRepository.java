package ss19_case_study_module2.repository;

import ss19_case_study_module2.model.Facility;

import java.util.LinkedHashMap;
import java.util.List;

public class FacilityRepository implements IRepository<Facility> {
    private int useCount=0;
    private  LinkedHashMap<Facility,Integer> hashMapFacility=new LinkedHashMap<>();

    @Override
    public int find(String id) {
        return 0;
    }

    @Override
    public List<Facility> readFile() {
        return null;
    }

    @Override
    public void writeFile(List<Facility> e) {

    }

    @Override
    public void add(Facility facility) {

    }

    @Override
    public void edit(Facility facility) {

    }
}
