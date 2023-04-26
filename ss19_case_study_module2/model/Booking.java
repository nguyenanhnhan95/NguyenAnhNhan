package ss19_case_study_module2.model;

import java.time.LocalDate;

public class Booking {
    private String codeBook;
    private LocalDate startRental;
    private LocalDate startDate;
    private LocalDate endDate;
    private String codeCustomer;
    private String idService;

    public Booking() {
    }

    public Booking(String codeBook, LocalDate startRental, LocalDate startDate,
                   LocalDate endDate, String codeCustomer, String idService) {
        this.codeBook = codeBook;
        this.startRental = startRental;
        this.startDate = startDate;
        this.endDate = endDate;
        this.codeCustomer = codeCustomer;
        this.idService = idService;
    }

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public LocalDate getStartRental() {
        return startRental;
    }

    public void setStartRental(LocalDate startRental) {
        this.startRental = startRental;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codeBook='" + codeBook + '\'' +
                ", startRental=" + startRental +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", codeCustomer='" + codeCustomer + '\'' +
                ", idService='" + idService + '\'' +
                '}';
    }

    public String getInForCsv() {
        return this.codeBook + "," + this.startRental + "," + this.startDate + "," + this.endDate + "," + this.codeCustomer + "," + this.idService;
    }
}
