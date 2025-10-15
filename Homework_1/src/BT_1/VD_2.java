package BT_1;

import java.util.Scanner;

// Class này chứa hàm main để chạy chương trình
public class VD_2 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để đọc dữ liệu
        Scanner sc = new Scanner(System.in);

        // Yêu cầu và đọc bán kính từ người dùng
        System.out.print("Nhập vào bán kính của hình tròn: ");
        double banKinh = sc.nextDouble();

        // --- Tính toán trực tiếp trong hàm main ---
        double chuVi = 2 * Math.PI * banKinh;
        double dienTich = Math.PI * banKinh * banKinh;

        // In kết quả ra màn hình
        System.out.println("------------------------------------");
        System.out.println("Chu vi của hình tròn là: " + chuVi);
        System.out.println("Diện tích của hình tròn là: " + dienTich);

        // Đóng Scanner
        sc.close();
    }
}