import java.util.Scanner;

public class Vidu_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương N: ");
        int n = sc.nextInt();

        // Dùng kiểu 'long' để tránh bị tràn số khi N lớn
        long tong = 0;

        // Lặp từ 1 đến N
        for (int i = 1; i <= n; i++) {
            tong = tong + i; // Cộng dồn i vào biến tổng
        }

        System.out.println("Tổng các số từ 1 đến " + n + " là: " + tong);
        sc.close();
    }
}