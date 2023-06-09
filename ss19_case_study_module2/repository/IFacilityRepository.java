package ss19_case_study_module2.repository;


import ss19_case_study_module2.model.Facility;
import ss19_case_study_module2.model.House;
import ss19_case_study_module2.model.Room;
import ss19_case_study_module2.model.Villa;

import java.util.List;
import java.util.Map;

public interface IFacilityRepository extends IRepository<Facility>{
    Map<Facility,Integer> getMapFacility();
    Facility finFacility(String id);
    Map<Facility,Integer> getFacilityMaintain();
}
