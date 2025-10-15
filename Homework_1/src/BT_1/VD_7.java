package BT_1;

import java.util.Scanner;
import java.lang.Math;

public class VD_7 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để đọc dữ liệu
        Scanner sc = new Scanner(System.in);

        // Yêu cầu người dùng nhập số nguyên N
        System.out.print("Nhập vào số nguyên N (có ít nhất 2 chữ số): ");
        int n = sc.nextInt();

        // Bước 1: Lấy giá trị tuyệt đối của N rồi chia cho 10 để loại bỏ chữ số cuối cùng.
        // Ví dụ: Math.abs(-24381) / 10 = 24381 / 10 = 2438
        int soDaBoChuSoCuoi = Math.abs(n) / 10;

        // Bước 2: Lấy kết quả trên chia lấy dư cho 10 để được chữ số cuối cùng của nó.
        // Ví dụ: 2438 % 10 = 8
        int chuSoGanCuoi = soDaBoChuSoCuoi % 10;

        // In kết quả
        System.out.println("------------------------------------");
        System.out.println("Chữ số gần cuối của " + n + " là: " + chuSoGanCuoi);

        // Đóng Scanner
        sc.close();
    }
}