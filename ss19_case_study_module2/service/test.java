package ss19_case_study_module2.service;

import ss19_case_study_module2.model.Employee;
import ss19_case_study_module2.model.Facility;
import ss19_case_study_module2.model.Room;
import ss19_case_study_module2.repository.FacilityRepository;
import ss19_case_study_module2.utils.ELevelEducation;
import ss19_case_study_module2.utils.ELevelPosition;
import ss19_case_study_module2.utils.ERentalType;
import ss19_case_study_module2.utils.EServiceFree;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        FacilityRepository facilityRepository= new FacilityRepository();
        Map<Facility,Integer> mapFacility =facilityRepository.getMapFacility();
        Set<Facility> facilitySet = mapFacility.keySet();
        for (Facility f:facilitySet) {
            if(f instanceof Room){
            Room room = (Room) f;
            System.out.println(room.getInForCsv());}
        }
    }
}
