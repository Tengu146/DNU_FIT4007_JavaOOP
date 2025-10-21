import java.util.Scanner;

public class Vidu_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai báo mảng 'a' có kích thước cố định là 5
        int[] a = new int[5];
        System.out.println("Nhập vào 5 số nguyên:");

        // Vòng lặp for để nhập 5 phần tử
        for (int i = 0; i < 5; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        System.out.println("Mảng vừa nhập là:");
        // Vòng lặp for để in mảng
        for (int i = 0; i < 5; i++) {
            // Dùng System.out.print (không xuống dòng) và cộng thêm dấu cách
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}