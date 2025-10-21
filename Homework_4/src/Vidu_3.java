import java.util.Scanner;

public class Vidu_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương N: ");
        int n = sc.nextInt();

        System.out.println("Các số từ " + n + " giảm về 1 là:");
        // Dùng vòng lặp for đếm ngược
        // Bắt đầu i = n, điều kiện dừng là i >= 1, mỗi lần giảm i đi 1 (i--)
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}