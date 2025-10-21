import java.util.Scanner;

public class ViDu_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào độ dài cạnh a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập vào độ dài cạnh b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập vào độ dài cạnh c: ");
        double c = sc.nextDouble();
          if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Ba cạnh này CÓ THỂ tạo thành một tam giác.");
        } else {
            System.out.println("Ba cạnh này KHÔNG THỂ tạo thành một tam giác.");
        }

        sc.close();
    }
}