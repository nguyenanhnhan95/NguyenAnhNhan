package ss14_debug_exception.bai_tap.triangle_exception;

import ss14_debug_exception.bai_tap.triangle_exception.IllegalTriangleException;

import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sideA, sideB, sideC;
        System.out.println("Nhập cạnh A");
        sideA = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cạnh B");
        sideB = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cạnh C");
        sideC = Integer.parseInt(sc.nextLine());
        try {
            conditionTriangle(sideA, sideB, sideC);
            System.out.println("Thành công");
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void conditionTriangle(double sideA, double sideB, double sideC) throws IllegalTriangleException {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalTriangleException("Nhập kích thước cạnh phải lớn hơn không");
        }
        if ((sideA + sideB) < sideC || (sideA + sideC) < sideB || (sideB + sideC) < sideA) {
            throw new IllegalTriangleException("Nhập kích thước độ dài cạnh không hợp lý");
        }
    }
}
