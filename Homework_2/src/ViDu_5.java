import java.util.Scanner;

public class ViDu_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào điểm số: ");
        double score = sc.nextDouble();
        if (score >= 0 && score <= 10) {
            System.out.println(score + " là điểm số hợp lệ.");
        } else {
            System.out.println(score + " không phải là điểm số hợp lệ.");
        }

        sc.close();
    }
}