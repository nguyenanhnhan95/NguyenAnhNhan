package ss19_case_study_module2.model;

import ss19_case_study_module2.model.Facility;
import ss19_case_study_module2.utils.ERentalType;

public class House extends Facility {
    private int standardHouse;
    private int numberOfFloors;
    private int numberUseHome;

    public House() {
    }

    public House(String idService, String nameService, double areUse, double priceTax, int numberPerson,
                 ERentalType typeRental, int standardHouse, int numberOfFloors) {
        super(idService, nameService, areUse, priceTax, numberPerson, typeRental);
        this.standardHouse = standardHouse;
        this.numberOfFloors = numberOfFloors;
    }

    public int getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(byte standardHouse) {
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

    public String getInForTOCsv() {
        return super.getInForTOCsv() + "," + this.standardHouse + "," + this.numberOfFloors;
    }
}
