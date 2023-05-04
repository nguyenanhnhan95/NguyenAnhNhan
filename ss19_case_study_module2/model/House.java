package ss19_case_study_module2.model;

import ss19_case_study_module2.model.Facility;
import ss19_case_study_module2.utils.ERentalType;
import ss19_case_study_module2.utils.EStandard;

public class House extends Facility {
    private EStandard standardHouse;
    private int numberOfFloors;
    private int numberUseHome;

    public House() {
    }

    public House(String idService, String nameService, double areUse, double priceTax, int numberPerson,
                 ERentalType typeRental, EStandard standardHouse, int numberOfFloors) {
        super(idService, nameService, areUse, priceTax, numberPerson, typeRental);
        this.standardHouse = standardHouse;
        this.numberOfFloors = numberOfFloors;
    }

    public EStandard getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(EStandard standardHouse) {
        this.standardHouse = standardHouse;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(byte numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberUseHome() {
        return numberUseHome;
    }

    public void setNumberUseHome(int numberUseHome) {
        this.numberUseHome = numberUseHome;
    }

    public String getInForCsv() {
        return super.getInForTOCsv() + "," + this.standardHouse + "," + this.numberOfFloors;
    }
}
