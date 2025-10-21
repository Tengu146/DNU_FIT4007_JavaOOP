import java.util.Scanner;

public class VIDu_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một ký tự (N, E, W, S): ");

        // Đọc chuỗi, chuyển thành chữ hoa, lấy ký tự đầu tiên
        char huong = sc.next().toUpperCase().charAt(0);

        // Lưu ý: Giải theo đúng quy định của đề bài
        switch (huong) {
            case 'N':
                System.out.println("Hướng Bắc");
                break;
            case 'S':
                System.out.println("Hướng Nam");
                break;
            case 'W': // Theo đề bài 'W' là hướng Đông
                System.out.println("Hướng Đông");
                break;
            case 'E': // Theo đề bài 'E' là hướng Tây
                System.out.println("Hướng Tây");
                break;
            default:
                System.out.println("Ký tự không hợp lệ.");
        }
        sc.close();
    }
}