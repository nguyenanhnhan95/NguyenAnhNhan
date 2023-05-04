package ss19_case_study_module2.repository;

import ss19_case_study_module2.model.Booking;
import ss19_case_study_module2.utils.ReadWriteFile;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookingRepository implements IBookingRepository {
    private static String PATH_BOOKING = "D:\\Codegym\\Module2\\src\\ss19_case_study_module2\\data\\booking.csv";
    private ReadWriteFile readWriteFile = new ReadWriteFile();
    private List<Booking> bookingList;

    @Override
    public int find(String id) {
        bookingList = new ArrayList<>();
        bookingList = getList();
        int size = bookingList.size();
        for (int i = 0; i < size; i++) {
            if (bookingList.get(i).getIdService().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Booking> getList() {
        List<String> stringList = new ArrayList<>();
        bookingList = new ArrayList<>();
        stringList = readWriteFile.readFile(PATH_BOOKING);
        String[] arrayA;
        for (String s : stringList) {
            arrayA = s.split(",");
//              public Booking(String codeBook, LocalDate dayBooking, LocalDate startDate,
//                    LocalDate endDate, String codeCustomer, String idService) {
            bookingList.add(new Booking(arrayA[0], LocalDate.parse(arrayA[1]), LocalDate.parse(arrayA[2]),
                    LocalDate.parse(arrayA[3]), arrayA[4], arrayA[5]));
        }
        return bookingList;
    }

    @Override
    public void add(Booking booking, boolean option) {
        bookingList=new ArrayList<>();
        bookingList=getList();
        bookingList.add(booking);
        Collections.sort(bookingList);
        int size=bookingList.size();
        readWriteFile.writeFile(bookingList.get(0).getInForCsv(), PATH_BOOKING, false);
        for (int i = 1; i <size ; i++) {
            readWriteFile.writeFile(bookingList.get(i).getInForCsv(), PATH_BOOKING, option);
        }
    }
    @Override
    public void edit(Booking booking) {

    }
}
