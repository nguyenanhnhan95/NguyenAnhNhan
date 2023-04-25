package ss19_case_study_module2.model.facility;

public class Room extends Facility {
    private int voucher;

    public Room() {
    }

    public Room(int voucher) {
        this.voucher = voucher;
    }

    public Room(String idService, String nameService, Double areUse, Double priceTax, int numberPerson, String rentalPackage, int voucher) {
        super(idService, nameService, areUse, priceTax, numberPerson, rentalPackage);
        this.voucher = voucher;
    }

    public int getVoucher() {
        return voucher;
    }

    public void setVoucher(int voucher) {
        this.voucher = voucher;
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
