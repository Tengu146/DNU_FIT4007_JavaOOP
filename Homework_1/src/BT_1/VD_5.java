import java.util.Scanner;

public class VD_5 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        // Khai báo hằng số cho năm tham chiếu
        final int NAM_THAM_CHIEU = 2023;

        // Yêu cầu người dùng nhập tuổi
        System.out.print("Nhập tuổi của sinh viên (tính đến năm 2023): ");
        int tuoi = sc.nextInt();

        // Tính năm sinh bằng cách lấy năm tham chiếu trừ đi số tuổi
        int namSinh = NAM_THAM_CHIEU - tuoi;

        // In kết quả ra màn hình
        System.out.println("------------------------------------");
        System.out.println("Tuổi của sinh viên đó là: " + namSinh);


    }
}