import java.util.Scanner;
import java.lang.Math;

public class VD_6 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        // Yêu cầu người dùng nhập vào số nguyên N
        System.out.print("Nhập vào số nguyên N: ");
        int n = sc.nextInt();

        // Lấy giá trị tuyệt đối của N để xử lý trường hợp số âm
        int soTuyetDoi = Math.abs(n);

        // Dùng phép chia lấy dư cho 10 để tìm chữ số cuối cùng
        int chuSoCuoi = soTuyetDoi % 10;

        // In kết quả ra màn hình
        System.out.println("------------------------------------");
        System.out.println("Chữ số cuối cùng của " + n + " là: " + chuSoCuoi);
    }
}