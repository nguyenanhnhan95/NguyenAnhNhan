package ss19_case_study_module2.repository;

import ss19_case_study_module2.model.Facility;
import ss19_case_study_module2.model.House;

import java.util.List;
import java.util.Map;

public interface IHouseRepository extends IRepository<House> {
    Map<House,Integer> getList();
}
