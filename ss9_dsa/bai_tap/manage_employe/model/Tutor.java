package ss9_dsa.bai_tap.manage_employe.model;

import java.time.LocalDate;

public class Tutor extends PersonCodeGym {
    private String specialize;

    public Tutor() {

    }

    public Tutor(String id, String name, String date, String gender, String specialize) {
        super(id, name, date, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Tutor{" + super.toString() +
                "specialize='" + specialize + '\'' +
                '}';
    }
}
