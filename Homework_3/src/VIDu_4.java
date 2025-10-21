import java.util.Scanner;

public class VIDu_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên a: ");
        int a = sc.nextInt();

        System.out.print("Nhập vào số nguyên b: ");
        int b = sc.nextInt();

        System.out.print("Nhập phép tính (+, -, *, /, %): ");
        char phepTinh = sc.next().charAt(0);

        switch (phepTinh) {
            case '+':
                System.out.println("Kết quả: " + a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println("Kết quả: " + a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println("Kết quả: " + a + " * " + b + " = " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Lỗi: Không thể chia cho 0.");
                } else {
                    // Ép kiểu (double) để có kết quả phép chia chính xác
                    System.out.println("Kết quả: " + a + " / " + b + " = " + ((double)a / b));
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Lỗi: Không thể chia cho 0.");
                } else {
                    System.out.println("Kết quả: " + a + " % " + b + " = " + (a % b));
                }
                break;
            default:
                System.out.println("Phép tính không hợp lệ.");
        }
        sc.close();
    }
}