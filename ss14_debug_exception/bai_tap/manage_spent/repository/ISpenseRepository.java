package ss14_debug_exception.bai_tap.manage_spent.repository;

import java.util.List;

public interface ISpenseRepository <E>{
    List<E> getList();
    void addSpense();
    void deleteSpense();
    boolean editSpense();
    boolean findSpense();
    boolean findApproximatelySpense();
    void writeSpense(E e);
}
