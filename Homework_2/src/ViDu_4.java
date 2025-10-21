import java.util.Scanner;

public class ViDu_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên a: ");
        int a = sc.nextInt();

        System.out.print("Nhập vào số nguyên b: ");
        int b = sc.nextInt();

        // Dùng câu lệnh if-else if-else để tìm số lớn hơn
        if (a > b) {
            System.out.println("Số lớn hơn là: " + a);
        } else if (b > a) {
            System.out.println("Số lớn hơn là: " + b);
        } else {
            System.out.println("Hai số bằng nhau.");
        }

        sc.close();
    }
}