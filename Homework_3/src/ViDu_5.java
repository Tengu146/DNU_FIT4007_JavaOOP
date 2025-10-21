import java.util.Scanner;

public class ViDu_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào năm: ");
        int nam = sc.nextInt();

        System.out.print("Nhập vào tháng: ");
        int thang = sc.nextInt();

        int soNgay = 0;

        switch (thang) {
            // Các tháng có 31 ngày
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                soNgay = 31;
                break;

            // Các tháng có 30 ngày
            case 4:
            case 6:
            case 9:
            case 11:
                soNgay = 30;
                break;

            // Tháng 2
            case 2:
                // Gợi ý: Kiểm tra năm nhuận
                boolean laNamNhuan = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
                if (laNamNhuan) {
                    soNgay = 29;
                } else {
                    soNgay = 28;
                }
                break;

            default:
                System.out.println("Tháng không hợp lệ (chỉ nhập từ 1-12).");
                sc.close();
                // Thoát chương trình sớm vì đầu vào sai
                return;
        }

        System.out.println("Tháng " + thang + " năm " + nam + " có " + soNgay + " ngày.");
        sc.close();
    }
}