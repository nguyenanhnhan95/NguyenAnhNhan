package ss14_debug_exception.bai_tap.manage_spent.service;

import ss14_debug_exception.bai_tap.manage_spent.model.Spense;
import ss14_debug_exception.bai_tap.manage_spent.repository.SpenseRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpenseService implements ISpenseService<Spense>{
    private SpenseRepository spenseRepository = new SpenseRepository();

    public SpenseService(){}
    @Override
    public void display() {
        System.out.println("+--------------------------------------------------------------+");
        System.out.println("| Mã chi tiêu |  Tên       |  Ngày        | Tiền     | Loại    |");
        for ( Spense s: spenseRepository.getList()) {
            System.out.println("+-------------+------------+--------------+----------+---------+");
            System.out.printf("|%-13s|%-12s|%14s|%10s|%-9s|\n",s.getId(),s.getName(),s.getSpentDate(),s.getNumberOfSpend(),s.getTypeOfSpend());
        }
        System.out.println("+--------------------------------------------------------------+");
    }

    @Override
    public List<Spense> getList() {
        return spenseRepository.getList();
    }

    @Override
    public void addSpense() {
        Map<String,Spense> map = new HashMap<>();
    }

    @Override
    public boolean deleteSpense() {
        return false;
    }

    @Override
    public void editSpense() {

    }

    @Override
    public boolean findSpense() {
        return false;
    }

    @Override
    public boolean finApproximatelySpense() {
        return false;
    }
}
