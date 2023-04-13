package ss9_dsa.bai_tap.manage_employe.model;

import java.time.LocalDate;

public class PersonCodeGym {
    private String id;
    private String name;
    private LocalDate date;
    private String gender;

    public PersonCodeGym(String id, String name, LocalDate date, String gender) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
