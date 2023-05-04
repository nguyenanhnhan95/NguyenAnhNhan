package ss19_case_study_module2.model;

import ss19_case_study_module2.model.House;
import ss19_case_study_module2.utils.ERentalType;
import ss19_case_study_module2.utils.EStandard;

public class Villa extends Facility {
    private double areaPool;
    private EStandard standardRoom;
    private int numberOfFloors;


    public Villa() {
    }

    public Villa(double areaPool, EStandard standardRoom, int numberOfFloors) {
        this.areaPool = areaPool;
        this.standardRoom = standardRoom;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String idService, String nameService, double areUse, double priceTax, int numberPerson,
                 ERentalType typeRental, double areaPool, EStandard standardRoom, int numberOfFloors) {
        super(idService, nameService, areUse, priceTax, numberPerson, typeRental);
        this.areaPool = areaPool;
        this.standardRoom = standardRoom;
        this.numberOfFloors = numberOfFloors;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public EStandard getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(EStandard standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "areaPool=" + areaPool +
                ", standardRoom=" + standardRoom +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    public String getInForCsv() {
        return super.getInForTOCsv() + "," + this.areaPool + "," + this.standardRoom + "," + this.numberOfFloors;
    }
}
