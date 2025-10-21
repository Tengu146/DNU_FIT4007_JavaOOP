import java.util.Scanner;

public class Vidu_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương N: ");
        int n = sc.nextInt();

        System.out.println("Các số từ 1 đến " + n + " là:");
        // Dùng vòng lặp for, cho i chạy từ 1 cho đến khi i <= n
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}