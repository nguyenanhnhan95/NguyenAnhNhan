package ss19_case_study_module2.model;

import ss19_case_study_module2.model.Facility;
import ss19_case_study_module2.utils.ERentalType;

public class Room extends Facility {
    private int voucher;
    private static int countUsing = 0;
    private int numberUseRoom;

    public Room() {
    }

    public Room(int voucher) {
        this.voucher = voucher;
    }

    public Room(String idService, String nameService, double areUse, double priceTax, int numberPerson, ERentalType typeRental, int voucher) {
        super(idService, nameService, areUse, priceTax, numberPerson, typeRental);
        this.voucher = voucher;
        numberUseRoom = ++countUsing;
    }

    public int getVoucher() {
        return voucher;
    }

    public void setVoucher(int voucher) {
        this.voucher = voucher;
    }

    public static int getCountUsing() {
        return countUsing;
    }

    public static void setCountUsing(int countUsing) {
        Room.countUsing = countUsing;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "voucher=" + voucher +
                '}';
    }

    public String getInForCsv() {
        return super.getInForTOCsv() + "," + this.voucher;
    }
}
