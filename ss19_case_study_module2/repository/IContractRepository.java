package ss19_case_study_module2.repository;

import ss19_case_study_module2.model.Booking;
import ss19_case_study_module2.model.Contraction;

import java.util.List;
import java.util.Queue;

public interface IContractRepository extends IRepository<Contraction>{
    Queue<Booking> getQueue();
    List<Contraction> getList();
}
