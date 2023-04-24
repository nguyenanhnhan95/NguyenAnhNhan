package ss14_debug_exception.bai_tap.manage_spent.repository;

import ss14_debug_exception.bai_tap.manage_spent.common.Common;
import ss14_debug_exception.bai_tap.manage_spent.model.Spense;

import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SpenseRepository extends Common implements ISpenseRepository<Spense>{
//    public Spense(String id, String name, LocalDate spentDate, double numberOfSpend, String typeOfSpend) {
    @Override
    public List<Spense> getList() {
        return readFile(PATH);
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

    @Override
    public void writeSpense(Spense spense) {
        writeFile(PATH,spense.writeCSV());
    }
}
