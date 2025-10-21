import java.util.Scanner;

public class ViDu_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên N: ");
        int n = sc.nextInt();

        // Số tự nhiên là các số nguyên không âm (>= 0)
        if (n >= 0) {
            System.out.println(n + " là số tự nhiên.");
        } else {
            System.out.println(n + " không phải là số tự nhiên.");
        }

        sc.close();
    }
}