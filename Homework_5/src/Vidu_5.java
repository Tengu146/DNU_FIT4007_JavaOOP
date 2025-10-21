import java.util.Scanner;

public class Vidu_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương N: ");
        int n = sc.nextInt();

        System.out.println("Các số chẵn nhỏ hơn hoặc bằng " + n + " là:");

        // Bắt đầu từ 2, và mỗi lần lặp tăng i lên 2 (i += 2)
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }

        sc.close();
    }
}