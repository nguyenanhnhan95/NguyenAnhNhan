package ss19_case_study_module2.repository;

import ss19_case_study_module2.model.Room;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public interface IRoomRepository extends IRepository<Room>{
    Map<Room,Integer> getList();
    void countUseRoom(String id);
}
