package ss14_debug_exception.bai_tap.manage_spent.service;

import java.util.List;

public interface ISpenseService <E>{
    void display();
    List<E> getList();
    void addSpense();
    boolean deleteSpense();
    void editSpense();
    boolean findSpense();
    boolean finApproximatelySpense();
}
