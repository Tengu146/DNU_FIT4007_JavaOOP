import java.util.Scanner;

public class ViDu_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào góc thứ nhất (a): ");
        int a = sc.nextInt();

        System.out.print("Nhập vào góc thứ hai (b): ");
        int b = sc.nextInt();

        System.out.print("Nhập vào góc thứ ba (c): ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 && (a + b + c == 180)) {
            System.out.println("Ba góc này CÓ THỂ là 3 góc của một tam giác.");
        } else {
            System.out.println("Ba góc này KHÔNG THỂ là 3 góc của một tam giác.");
        }

        sc.close();
    }
}