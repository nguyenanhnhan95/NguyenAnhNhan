package ss19_case_study_module2.model;

import ss19_case_study_module2.utils.ERentalType;

import java.util.Objects;

public abstract class Facility {
    private String idService;
    private String nameService;
    private double areUse;
    private double priceTax;
    private int numberPerson;
    private ERentalType typeRental;

    public Facility() {
    }

    public Facility(String idService, String nameService, double areUse, double priceTax, int numberPerson, ERentalType typeRental) {
        this.idService = idService;
        this.nameService = nameService;
        this.areUse = areUse;
        this.priceTax = priceTax;
        this.numberPerson = numberPerson;
        this.typeRental = typeRental;
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

    public double getAreUse() {
        return areUse;
    }

    public void setAreUse(double areUse) {
        this.areUse = areUse;
    }

    public double getPriceTax() {
        return priceTax;
    }

    public void setPriceTax(double priceTax) {
        this.priceTax = priceTax;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }

    public ERentalType getTypeRental() {
        return typeRental;
    }

    public void setTypeRental(ERentalType typeRental) {
        this.typeRental = typeRental;
    }

    public String getInForTOCsv() {
        return this.idService + "," + this.nameService + "," + this.areUse + "," +
                this.priceTax + "," + this.numberPerson + "," + this.typeRental;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Objects.equals(idService, facility.idService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idService);
    }
}
