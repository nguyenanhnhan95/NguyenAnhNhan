package ss19_case_study_module2.model;

import java.time.LocalDate;

public abstract class Person {
    private String code;
    private String name;
    private LocalDate dayOfBirth;
    private String gender;
    private String id;
    private String numberPhone;
    private String email;
    public Person(){}

    public Person(String code, String name, LocalDate dayOfBirth, String gender, String id, String numberPhone, String email) {
        this.code = code;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.id = id;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", gender='" + gender + '\'' +
                ", id='" + id + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public String getInForCsv(){
        return this.code+","+this.email+","+this.dayOfBirth+","+this.gender+","+this.id+","+this.numberPhone+","+this.email;
    }
}
