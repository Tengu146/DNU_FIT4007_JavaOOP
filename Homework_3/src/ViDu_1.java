import java.util.Scanner;

public class ViDu_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số tự nhiên (0-9): ");
        int n = sc.nextInt();
        String cachDoc;

        switch (n) {
            case 0:
                cachDoc = "Không";
                break;
            case 1:
                cachDoc = "Một";
                break;
            case 2:
                cachDoc = "Hai";
                break;
            case 3:
                cachDoc = "Ba";
                break;
            case 4:
                cachDoc = "Bốn";
                break;
            case 5:
                cachDoc = "Năm";
                break;
            case 6:
                cachDoc = "Sáu";
                break;
            case 7:
                cachDoc = "Bảy";
                break;
            case 8:
                cachDoc = "Tám";
                break;
            case 9:
                cachDoc = "Chín";
                break;
            default:
                cachDoc = "Số không hợp lệ (chỉ nhập từ 0-9).";
        }

        System.out.println("Kết quả: " + cachDoc);
        sc.close();
    }
}