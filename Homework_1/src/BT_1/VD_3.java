import java.util.Scanner;

public class VD_3 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        // Yêu cầu người dùng nhập chiều dài
        System.out.print("Nhập vào chiều dài của hình chữ nhật: ");
        double chieuDai = sc.nextDouble();

        // Yêu cầu người dùng nhập chiều rộng
        System.out.print("Nhập vào chiều rộng của hình chữ nhật: ");
        double chieuRong = sc.nextDouble();

        // Tính chu vi theo công thức: P = 2 * (dài + rộng)
        double chuVi = 2 * (chieuDai + chieuRong);

        // Tính diện tích theo công thức: S = dài * rộng
        double dienTich = chieuDai * chieuRong;

        // In kết quả ra màn hình
        System.out.println("------------------------------------");
        System.out.println("Chu vi hình chữ nhật là: " + chuVi);
        System.out.println("Diện tích hình chữ nhật là: " + dienTich);

        // Đóng đối tượng Scanner để giải phóng tài nguyên

    }
}