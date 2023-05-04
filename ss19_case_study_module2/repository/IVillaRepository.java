package ss19_case_study_module2.repository;

import ss19_case_study_module2.model.Facility;
import ss19_case_study_module2.model.Villa;

import java.util.List;
import java.util.Map;

public interface IVillaRepository extends IRepository<Villa>{
    Map<Villa,Integer> getList();
}
