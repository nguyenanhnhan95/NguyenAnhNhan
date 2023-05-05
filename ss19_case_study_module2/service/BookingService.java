package ss19_case_study_module2.service;

import ss19_case_study_module2.model.*;
import ss19_case_study_module2.repository.*;
import ss19_case_study_module2.utils.RegexFurama;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class BookingService implements IBookingService {
    private CustomerService customerService = new CustomerService();
    private CustomerRepository customerRepository = new CustomerRepository();
    private FacilityService facilityService = new FacilityService();
    private FacilityRepository facilityRepository = new FacilityRepository();
    private BookingRepository bookingRepository = new BookingRepository();
    private RegexFurama regexFurama = new RegexFurama();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        String codeBooking = null;
        String codeCustomer = null;
        String codeService = null;
        List<Customer> customerList = new ArrayList<>();
        customerList = customerRepository.getList();
        String dayCheckIN = null;
        String dayCheckOut = null;
        String dayBooking = null;
        boolean flag = true;
        int count = 0;
        customerService.display();
        do {
            switch (count) {
                case 0:
                    System.out.println("Enter choice code customer :");
                    codeCustomer = sc.nextLine().trim();
                    for (Customer c : customerList) {
                        if (c.getCode().equals(codeCustomer)) {
                            ++count;
                            facilityService.display();
                            break;
                        }
                    }
                    if (count == 0) {
                        System.err.println("You enter the customer code don't existing :");
                    }
                    break;
                case 1:
                    System.out.println("Enter choice the service code :");
                    codeService = sc.nextLine().trim();
                    if(facilityRepository.find(codeService)==-1){
                        ++count;
                    }
                    else {
                        System.err.println("You enter fault :");
                    }
                    break;
                case 2:
                    System.out.println("Enter day booking :");
                    dayBooking = sc.nextLine().trim();
                    if (regexFurama.regexYear(dayBooking)) {
                        if (Period.between(LocalDate.now(), LocalDate.parse(dayBooking)).getDays() < 0) {
                            ++count;
                        } else {
                            System.out.println("Enter day booking fault");
                        }
                    } else {
                        System.out.println("You enter fault :");
                    }
                    break;
                case 3:
                    System.out.println("Enter day check in :");
                    dayCheckIN = sc.nextLine().trim();
                    if (regexFurama.regexYear(dayCheckIN)) {
                        int index = bookingRepository.find(codeService);
                        if (index != -1) {
                            List<Booking> bookingList = new ArrayList<>();
                            bookingList = bookingRepository.getList();
                            if (Period.between(bookingList.get(index).getEndDate(), LocalDate.parse(dayCheckIN)).getDays() < 0
                                    && Period.between(bookingList.get(index).getStartDate(), LocalDate.parse(dayCheckIN)).getDays() > 0) {
                                count = 1;
                                System.err.println("Service is renting :");
                            } else {
                                ++count;
                            }
                        } else {
                            ++count;
                        }
                    } else {
                        System.out.println("You enter fault :");
                    }
                    break;
                case 4:
                    System.out.println("Enter day check out :");
                    dayCheckOut = sc.nextLine().trim();
                    if (regexFurama.regexYear(dayCheckOut)) {
                        ++count;
                    } else {
                        System.out.println("You enter fault :");
                    }
                    break;
                case 5:
                    System.out.println("Enter code booking :");
                    codeBooking = sc.nextLine().trim();
                    if (regexFurama.regexCodeBooking(codeBooking)) {
                        if (bookingRepository.find(codeBooking) == -1) {
                            ++count;
                        } else {
                            System.err.println("You enter booking existing :");
                        }
                    } else {
                        System.out.println("You re-enter code booking :");
                    }
                    break;
                case 6:
                    bookingRepository.add(new Booking(codeBooking, LocalDate.parse(dayBooking), LocalDate.parse(dayCheckIN), LocalDate.parse(dayCheckOut),
                            codeCustomer, codeService), true);
                    facilityRepository.edit(facilityRepository.finFacility(codeService));
                    ++count;
            }
        } while (count != 7);
    }

    @Override
    public void display() {
        List<Booking> bookingList = new ArrayList<>();
        bookingList = bookingRepository.getList();
//        BO-0001,2023-03-25,2023-04-29,2023-05-05,KH-1995,SVHO-0001
        System.out.println("+--------------+--------------------+--------------------+--------------------+" +
                "---------------+--------------+");
        System.out.println("|     Code     |   Day Booking      |    Day Check In    |  Day Check Out     |" +
                " Code Customer | Code Service |");
        for (Booking b : bookingList) {
            System.out.println("+--------------+--------------------+--------------------+--------------------+" +
                    "---------------+--------------+");
            System.out.printf("|%-14s|%-20s|%-20s|%-20s|%-15s|%-14s|\n",
                    b.getCodeBook(), b.getStartRental(), b.getStartDate(), b.getEndDate(), b.getCodeCustomer(), b.getIdService());
        }
        System.out.println("+--------------+--------------------+--------------------+--------------------+" +
                "---------------+--------------+");
    }

    @Override
    public void edit() {

    }
}
