package ss19_case_study_module2.repository;

import ss19_case_study_module2.model.Booking;

import java.util.List;

public class BookingRepository implements IBookingRepository{
    @Override
    public int find(String id) {
        return 0;
    }

    @Override
    public List<Booking> readFile() {
        return null;
    }

    @Override
    public void writeFile(List<Booking> bookingList) {

    }

    @Override
    public Booking edit() {
        return null;
    }

    @Override
    public void add() {

    }
}
