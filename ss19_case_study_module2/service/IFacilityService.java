package ss19_case_study_module2.service;

import ss19_case_study_module2.model.Facility;

public interface IFacilityService extends IService<Facility>{
    public void addHouse();
    public void addVila();
    public void addRoom();
}
