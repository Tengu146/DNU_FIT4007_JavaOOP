import java.util.Scanner;

public class ViDu_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chiều dài của hình chữ nhật: ");
        double chieuDai = sc.nextDouble();

        System.out.print("Nhập vào chiều rộng của hình chữ nhật: ");
        double chieuRong = sc.nextDouble();


        if (chieuDai == chieuRong) {
            System.out.println("Đây là hình vuông.");
        } else {
            System.out.println("Đây không phải là hình vuông.");
        }

        sc.close();
    }
}