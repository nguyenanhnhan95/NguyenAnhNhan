package ss14_debug_exception.bai_tap.manage_spent.model;

import java.time.LocalDate;

public class Spense {
    private String id;
    private String name;
    private LocalDate spentDate;
    private double numberOfSpend=0.0d;
    private String typeOfSpend;

    public Spense(String id, String name, LocalDate spentDate, double numberOfSpend, String typeOfSpend) {
        this.id = id;
        this.name = name;
        this.spentDate = spentDate;
        this.numberOfSpend = numberOfSpend;
        this.typeOfSpend = typeOfSpend;
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

    public LocalDate getSpentDate() {
        return spentDate;
    }

    public void setSpentDate(LocalDate spentDate) {
        this.spentDate = spentDate;
    }

    public double getNumberOfSpend() {
        return numberOfSpend;
    }

    public void setNumberOfSpend(double numberOfSpend) {
        this.numberOfSpend = numberOfSpend;
    }

    public String getTypeOfSpend() {
        return typeOfSpend;
    }

    public void setTypeOfSpend(String typeOfSpend) {
        this.typeOfSpend = typeOfSpend;
    }
    public void readCSV(){
//        return getId()+","+getName()
    }
    public String writeCSV(){
        return getId()+","+getName()+","+getSpentDate()+","+getNumberOfSpend()+","+getTypeOfSpend();
    }
    @Override
    public String toString() {
        return "Spense{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", spentDate=" + spentDate +
                ", numberOfSpend=" + numberOfSpend +
                ", typeOfSpend='" + typeOfSpend + '\'' +
                '}';
    }
}
