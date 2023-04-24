package ss14_debug_exception.bai_tap.manage_spent.service;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;
import ss14_debug_exception.bai_tap.manage_spent.common.Common;
import ss14_debug_exception.bai_tap.manage_spent.model.Spense;
import ss14_debug_exception.bai_tap.manage_spent.repository.SpenseRepository;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SpenseService extends Common implements ISpenseService<Spense> {
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
        int choice = 1;
        String name=null, date=null, type=null, money=null,id=null;
        LocalDate parseDate=null;
        do {
            switch (choice) {
                case 1:
                    System.out.println("Nhap id chi tieu");
                    id = sc.nextLine().trim();
                    if (id.matches("[a-zA-Z 0-9]+")) {
                        System.out.println("Nhap id hop le :");
                        ++choice;
                    } else {
                        System.out.println("Id không hợp lệ vui long nhap lai:");
                    }
                    break;
                case 2:
                    System.out.println("Nhap tên:");
                    name = sc.nextLine().trim();
                    if (name.matches("[a-zA-Z ]+")) {
                        ++choice;
                    } else {
                        System.out.println("Tên không hợp lệ :");
                    }
                    break;
                case 3:
                    System.out.println("Nhập ngày chi tiêu :");
                    date = sc.nextLine().trim();
                    try {
                       parseDate = LocalDate.parse(date);
                        choice++;
                    } catch (DateTimeException e) {
                        System.out.println("Nhap ngay khong phu hop :");
                    }
                    break;
                case 4:
                    System.out.println("Nhập số tiền bạn ");
                    money= sc.nextLine().trim();
                    if (money.matches("[0-9]+")) {
                        choice++;
                    } else {
                        System.out.println("Nhập số tiền không hợp lý :");
                    }
                    break;
                case 5:
                    System.out.println("Nhập loại sản phẩm :");
                    type = sc.nextLine().trim();
                    if (type.matches("[a-zA-Z ]+")) {
                        ++choice;
                    } else {
                        System.out.println("Nhập không phù hợp :");
                    }
                    break;
                default:
                    System.out.println("Bạn đã nhập thành công :");
            }
        } while (choice != 6);
        spenseRepository.writeSpense(new Spense(id,name,parseDate,Double.valueOf(money),type));
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
