package ss19_case_study_module2.model;

import ss19_case_study_module2.utils.ERentalType;
import ss19_case_study_module2.utils.EServiceFree;

public class Room extends Facility {
    private EServiceFree serviceFree;


    public Room() {
    }

    public Room(EServiceFree voucher) {
        this.serviceFree = voucher;
    }

    public Room(String idService, String nameService, double areUse, double priceTax, int numberPerson, ERentalType typeRental ,EServiceFree serviceFree) {
        super(idService, nameService, areUse, priceTax, numberPerson, typeRental);
        this.serviceFree = serviceFree;
    }

    public EServiceFree getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(EServiceFree serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "voucher=" + serviceFree +
                '}';
    }

    public String getInForCsv() {
        return super.getInForTOCsv() + "," + this.serviceFree;
    }
}
