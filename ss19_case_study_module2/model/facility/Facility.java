package ss19_case_study_module2.model.facility;

public abstract class Facility {
    private String idService;
    private String nameService;
    private Double areUse;
    private Double priceTax;
    private int numberPerson;
    private String rentalPackage;

    public Facility() {
    }

    public Facility(String idService, String nameService, Double areUse, Double priceTax, int numberPerson, String rentalPackage) {
        this.idService = idService;
        this.nameService = nameService;
        this.areUse = areUse;
        this.priceTax = priceTax;
        this.numberPerson = numberPerson;
        this.rentalPackage = rentalPackage;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Double getAreUse() {
        return areUse;
    }

    public void setAreUse(Double areUse) {
        this.areUse = areUse;
    }

    public Double getPriceTax() {
        return priceTax;
    }

    public void setPriceTax(Double priceTax) {
        this.priceTax = priceTax;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }

    public String getRentalPackage() {
        return rentalPackage;
    }

    public void setRentalPackage(String rentalPackage) {
        this.rentalPackage = rentalPackage;
    }

    public String getInForTOCsv() {
        return this.idService + "," + this.nameService + "," + this.areUse + "," +
                this.priceTax + "," + this.numberPerson + "," + this.rentalPackage;
    }
}
