import java.util.Scanner;

public class Vidu_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; // Khai báo N

        // Dùng vòng lặp do-while để đảm bảo thân vòng lặp chạy ít nhất 1 lần
        do {
            System.out.print("Nhập vào số nguyên N (phải > 0): ");
            n = sc.nextInt();

            // Nếu nhập sai, thông báo lỗi
            if (n <= 0) {
                System.out.println("Số N phải > 0. Vui lòng nhập lại.");
            }
        } while (n <= 0); // Lặp lại nếu điều kiện (n <= 0) còn đúng

        System.out.println("Bạn đã nhập thành công số: " + n);
        sc.close();
    }
}