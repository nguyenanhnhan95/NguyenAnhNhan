package ss6_inheritance.bai_tap.food;

import java.util.Arrays;

public class Food {
    private String id = "X1";
    private String nameProduct = "Apple";
    private double price;
    private int[] dateOfManufacture = {04, 7, 2023};
    private int[] monthExpire = {04, 8, 2023};

    public Food(String id, String nameProduct, double price, int[] dateOfManufacture, int[] monthExpire) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.dateOfManufacture = dateOfManufacture;
        this.monthExpire = monthExpire;
        this.price = price;
    }

    public Food(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int[] getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(int[] dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public int[] getMonthExpire() {
        return monthExpire;
    }

    public void setMonthExpire(int[] monthExpire) {
        this.monthExpire = monthExpire;
    }

    public boolean checkExpire() {
        int[] arrayA = getMonthExpire();
        int[] arrayB = getDateOfManufacture();
        for (int i = arrayA.length - 1; i >= 0; i--) {
            if (arrayB[i] > arrayA[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkProduct() {
        if (getNameProduct() == "" || getId() == "" || getPrice() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (checkProduct() == true && checkExpire() == true) {
            return "Food" +
                    "id='" + getId() + '\'' +
                    ", nameProduct='" + getNameProduct() + '\'' +
                    ", price=" + getPrice() +
                    ", dateOfManufacture=" + getDateOfManufacture()[0] + "/" + getDateOfManufacture()[1] + "/" + getDateOfManufacture()[2] +
                    ", monthExpire=" + getMonthExpire()[0] + "/" + getMonthExpire()[1] + "/" + getMonthExpire()[2];
        } else {
            return "Product does not exit";
        }
    }
}
