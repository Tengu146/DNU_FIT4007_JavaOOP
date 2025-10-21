import java.util.Scanner;

public class Vidu_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương S: ");
        long s = sc.nextLong();

        long tong = 0;
        int n = 0; // Bắt đầu từ N = 0

        // Dùng vòng lặp while vì không biết trước số lần lặp
        // Lặp chừng nào tổng vẫn còn nhỏ hơn S
        while (tong < s) {
            n++;         // Tăng N lên 1 (N=1, N=2, N=3...)
            tong += n;   // Cộng N vào tổng (tong = tong + n)
        }

        System.out.println("N nhỏ nhất để tổng 1 + ... + N >= S là: " + n);
        sc.close();
    }
}