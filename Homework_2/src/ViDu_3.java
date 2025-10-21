import java.util.Scanner;

public class ViDu_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên N: ");
        int n = sc.nextInt();


        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn.");
        } else {
            System.out.println(n + " là số lẻ.");
        }

        sc.close();
    }
}