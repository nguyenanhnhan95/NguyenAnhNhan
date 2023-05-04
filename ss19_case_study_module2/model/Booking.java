package ss19_case_study_module2.model;

import java.time.LocalDate;

public class Booking implements Comparable<Booking> {
    private String codeBook;
    private LocalDate dayBooking;
    private LocalDate startDate;
    private LocalDate endDate;
    private String codeCustomer;
    private String idService;

    public Booking() {
    }

    public Booking(String codeBook, LocalDate dayBooking, LocalDate startDate,
                   LocalDate endDate, String codeCustomer, String idService) {
        this.codeBook = codeBook;
        this.dayBooking = dayBooking;
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
        return dayBooking;
    }

    public void setStartRental(LocalDate dayBooking) {
        this.dayBooking = dayBooking;
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
                ", startRental=" + dayBooking +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", codeCustomer='" + codeCustomer + '\'' +
                ", idService='" + idService + '\'' +
                '}';
    }

    public String getInForCsv() {
        return this.codeBook + "," + this.dayBooking + "," + this.startDate + "," + this.endDate + "," + this.codeCustomer + "," + this.idService;
    }
    @Override
    public int compareTo(Booking o) {
        int result =this.getStartRental().compareTo(((Booking)o).getStartRental());
        if(result ==0) {
            result=this.getEndDate().compareTo(o.getEndDate());
        }
        return  result;
    }
}
