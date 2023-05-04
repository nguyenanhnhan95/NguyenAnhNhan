package ss19_case_study_module2.repository;

import ss19_case_study_module2.model.Booking;

import java.util.List;

public interface IBookingRepository extends IRepository<Booking> {
    List<Booking> getList();
}
