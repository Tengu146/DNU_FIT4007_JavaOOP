package BT_1;

import java.util.Scanner;

public class VD_4 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        // Yêu cầu người dùng nhập vào 3 cạnh của tam giác
        System.out.print("Nhập vào độ dài cạnh a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập vào độ dài cạnh b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập vào độ dài cạnh c: ");
        double c = sc.nextDouble();

        // Tính chu vi theo công thức: P = a + b + c
        double chuVi = a + b + c;

        // Tính diện tích theo công thức Heron
        // Bước 1: Tính nửa chu vi (p)
        double p = chuVi / 2;

        // Bước 2: Áp dụng công thức S = sqrt(p * (p - a) * (p - b) * (p - c))
        double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        // In kết quả ra màn hình
        System.out.println("------------------------------------");
        System.out.println("Chu vi của tam giác là: " + chuVi);
        System.out.println("Diện tích của tam giác là: " + dienTich);


    }
}
