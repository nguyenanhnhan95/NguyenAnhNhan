package ss19_case_study_module2.model.facility;

public class House extends Facility {
    private byte standardHouse;
    private byte numberOfFloors;

    public House() {
    }

    public House(byte standardHouse, byte numberOfFloors) {
        this.standardHouse = standardHouse;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String idService, String nameService, Double areUse, Double priceTax, int numberPerson, String rentalPackage, byte standardHouse, byte numberOfFloors) {
        super(idService, nameService, areUse, priceTax, numberPerson, rentalPackage);
        this.standardHouse = standardHouse;
        this.numberOfFloors = numberOfFloors;
    }

    public byte getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(byte standardHouse) {
        this.standardHouse = standardHouse;
    }

    public byte getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(byte numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getInForTOCsv() {
        return super.getInForTOCsv()+","+this.standardHouse+","+this.numberOfFloors;
    }
}
