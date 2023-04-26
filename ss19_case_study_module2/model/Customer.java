package ss19_case_study_module2.model;

import ss19_case_study_module2.utils.ELevelCustomer;

import java.time.LocalDate;

public class Customer extends Person {
    private ELevelCustomer levelCustomer;
    private String addressCustomer;

    public Customer() {
    }

    public Customer(String code, String name, LocalDate dayOfBirth, String gender, String id, String numberPhone, String email, ELevelCustomer levelCustomer, String addressCustomer) {
        super(code, name, dayOfBirth, gender, id, numberPhone, email);
        this.levelCustomer = levelCustomer;
        this.addressCustomer = addressCustomer;
    }

    public ELevelCustomer getLevelCustomer() {
        return levelCustomer;
    }

    public void setLevelCustomer(ELevelCustomer levelCustomer) {
        this.levelCustomer = levelCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "levelCustomer=" + levelCustomer +
                ", addressCustomer='" + addressCustomer + '\'' +
                '}';
    }

    public String getInForCsv() {
        return super.getInForCsv() + "," + this.levelCustomer + "," + this.addressCustomer;
    }
}