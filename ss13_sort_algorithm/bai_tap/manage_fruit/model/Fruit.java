package ss13_sort_algorithm.bai_tap.manage_fruit.model;

import java.time.LocalDate;

public class Fruit {
    private String name;
    private int quality;
    private LocalDate expireFruit;
    private LocalDate dateOfManufacture;
    private String origin;
    private int price;

    public Fruit() {
    }

    public Fruit(String name, int quality, LocalDate expireFruit, LocalDate dateOfManufacture, String origin, int price) {
        this.name = name;
        this.quality = quality;
        this.expireFruit = expireFruit;
        this.dateOfManufacture = dateOfManufacture;
        this.origin = origin;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public LocalDate getExpireFruit() {
        return expireFruit;
    }

    public void setExpireFruit(LocalDate expireFruit) {
        this.expireFruit = expireFruit;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", quality=" + quality +
                ", expireFruit=" + expireFruit +
                ", dateOfManufacture=" + dateOfManufacture +
                ", origin='" + origin + '\'' +
                '}';
    }

}

