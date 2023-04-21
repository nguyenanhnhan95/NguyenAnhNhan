package ss14_debug_exception.bai_tap.manage_spent.service;

import ss14_debug_exception.bai_tap.manage_spent.model.Spense;
import ss14_debug_exception.bai_tap.manage_spent.repository.SpenseRepository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SpenseService implements ISpenseService<Spense> {
    private SpenseRepository spenseRepository = new SpenseRepository();
    private Scanner sc = new Scanner(System.in);

    public SpenseService() {
    }

    @Override
    public void display() {
        System.out.println("+--------------------------------------------------------------+");
        System.out.println("| Mã chi tiêu |  Tên       |  Ngày        | Tiền     | Loại    |");
        for (Spense s : spenseRepository.getList()) {
            System.out.println("+-------------+------------+--------------+----------+---------+");
            System.out.printf("|%-13s|%-12s|%14s|%10s|%-9s|\n", s.getId(), s.getName(), s.getSpentDate(), s.getNumberOfSpend(), s.getTypeOfSpend());
        }
        System.out.println("+--------------------------------------------------------------+");
    }

    @Override
    public List<Spense> getList() {
        return spenseRepository.getList();
    }

    @Override
    public void addSpense() {
//        System.out.println("| Mã chi tiêu |  Tên       |  Ngày        | Tiền     | Loại    |");
        int choice = 1;
        String id, name, date, type;
        double money=0.0d;
        do {
            switch (choice) {
                case 1:
                    System.out.println("Nhap id chi tieu");
                    id = sc.nextLine();
                    if (id.matches("[0-9]+")) {
                        System.out.println("Nhap id hop le :");
                        ++choice;
                        continue;
                    }
                    else{
                        System.out.println("Id không hợp lệ vui long nhap lai:");
                    }
                    break;
                case 2:
                    System.out.println("Nhap ten :");
                    name = sc.nextLine();
                    if (name.matches("[a-zA-Z_]+")) {
                        ++choice;
                        continue;
                    }
                    else{
                        System.out.println("Tên không hợp lệ :");
                    }
                    break;
                case 3:
                    date= sc.nextLine();
                    try {
                        LocalDate.parse(date);
                        choice++;
                    } catch (Exception e) {
                        System.out.println("Nhap khong phu hop");
                    }
                    break;
                case 4:
//                    money=Double.parseDouble(sc.nextLine());
//                    System.out.println("Nhập số tiền chi tiêu:");
//                    Scanner keyboard;
//                    if (keyboard.hasNextDouble()){
//                        money = keyboard.nextDouble();
//                    }
            }

        } while (choice != 5);
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
