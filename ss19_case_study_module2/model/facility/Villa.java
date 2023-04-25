package ss19_case_study_module2.model.facility;

public class Villa extends House {
    private Double areaPool;

    public Villa() {
    }

    public Villa(Double areaPool) {
        this.areaPool = areaPool;
    }

    public Villa(byte standardHouse, byte numberOfFloors, Double areaPool) {
        super(standardHouse, numberOfFloors);
        this.areaPool = areaPool;
    }

    public Villa(String idService, String nameService, Double areUse, Double priceTax, int numberPerson, String rentalPackage, byte standardHouse, byte numberOfFloors, Double areaPool) {
        super(idService, nameService, areUse, priceTax, numberPerson, rentalPackage, standardHouse, numberOfFloors);
        this.areaPool = areaPool;
    }

    public Double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(Double areaPool) {
        this.areaPool = areaPool;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "areaPool=" + areaPool +
                '}';
    }

    public String getInForToCsv() {
        return super.getInForTOCsv() + "," + this.areaPool;
    }
}
