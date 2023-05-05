package ss19_case_study_module2.service;

import ss19_case_study_module2.model.Facility;

public interface IFacilityService extends IService<Facility>{
    void displayMaintain();
    void addRoom();
    void addVilla();
    void addHouse();
}
