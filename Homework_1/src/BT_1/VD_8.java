package BT_1;

import java.util.Scanner;

public class VD_8 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        // Yêu cầu người dùng nhập tên
        System.out.print("Nhập vào tên của bạn: ");

        // Dùng nextLine() để đọc cả dòng tên (bao gồm cả dấu cách)
        String ten = sc.nextLine();

        // Dùng phương thức .length() để lấy độ dài của chuỗi
        int doDai = ten.length();

        // In kết quả ra màn hình
        System.out.println("------------------------------------");
        System.out.println("Độ dài tên của bạn là: " + doDai + " ký tự.");


    }
}