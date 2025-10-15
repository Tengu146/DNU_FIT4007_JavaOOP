package BT_1;

import java.util.Scanner;

public class VD_9 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để đọc dữ liệu
        Scanner sc = new Scanner(System.in);

        // Yêu cầu và đọc hai số nguyên a và b
        System.out.print("Nhập vào số nguyên a: ");
        int a = sc.nextInt();

        System.out.print("Nhập vào số nguyên b (khác 0): ");
        int b = sc.nextInt();

        // In ra kết quả chỉ bằng một lệnh println
        // Ép kiểu 'a' thành 'double' để đảm bảo phép chia là phép chia số thực
        System.out.println(a + " / " + b + " = " + ((double)a / b));

    }
}