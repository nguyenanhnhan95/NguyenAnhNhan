package ss19_case_study_module2.model;

public class Contraction {
    private String codeContract;
    private String codeBook;
    private double numberOfDeposit;
    private double totalOfPay;

    public Contraction() {
    }

    public Contraction(String codeContract, String codeBook, double numberOfDeposit, double totalOfPay) {
        this.codeContract = codeContract;
        this.codeBook = codeBook;
        this.numberOfDeposit = numberOfDeposit;
        this.totalOfPay = totalOfPay;
    }

    public String getCodeContract() {
        return codeContract;
    }

    public void setCodeContract(String codeContract) {
        this.codeContract = codeContract;
    }

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public double getNumberOfDeposit() {
        return numberOfDeposit;
    }

    public void setNumberOfDeposit(double numberOfDeposit) {
        this.numberOfDeposit = numberOfDeposit;
    }

    public double getTotalOfPay() {
        return totalOfPay;
    }

    public void setTotalOfPay(double totalOfPay) {
        this.totalOfPay = totalOfPay;
    }

    @Override
    public String toString() {
        return "Contraction{" +
                "codeContract='" + codeContract + '\'' +
                ", codeBook='" + codeBook + '\'' +
                ", numberOfDeposit=" + numberOfDeposit +
                ", totalOfPay=" + totalOfPay +
                '}';
    }

    public String getInForCsv() {
        return this.codeContract + "," + this.codeBook + "," + this.numberOfDeposit + "," + this.totalOfPay;
    }
}
