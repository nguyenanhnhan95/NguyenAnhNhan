package ss14_debug_exception.bai_tap.manage_spent.repository;

import ss14_debug_exception.bai_tap.manage_spent.model.Spense;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SpenseRepository implements ISpenseRepository<Spense>{
    private static List<Spense> spentList =new ArrayList<Spense>();
//    public Spense(String id, String name, LocalDate spentDate, double numberOfSpend, String typeOfSpend) {
    static {
        Spense spenseOne = new Spense("25P1","Điện thoại",LocalDate.of(2023,04,20),23000,"Iphone");
        Spense spenseTwo = new Spense("25L1","Lap top",LocalDate.of(2023,04,17),32000,"Macbook");
        spentList.add(spenseOne);
        spentList.add(spenseTwo);
    }

    @Override
    public List<Spense> getList() {
        return spentList;
    }

    @Override
    public void addSpense() {

    }

    @Override
    public void deleteSpense() {

    }

    @Override
    public boolean editSpense() {
        return false;
    }

    @Override
    public boolean findSpense() {
        return false;
    }

    @Override
    public boolean findApproximatelySpense() {
        return false;
    }
}
