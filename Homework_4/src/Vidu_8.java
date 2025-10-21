import java.util.Scanner;

public class Vidu_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương N: ");
        int n = sc.nextInt();

        int tempN = n; // Tạo biến tạm để chia, giữ lại N ban đầu để in
        boolean laLuyThuaCua2 = true;

        if (n <= 0) { // Số 0 hoặc số âm không phải
            laLuyThuaCua2 = false;
        } else if (n == 1) { // Trường hợp đặc biệt: 1 = 2^0
            laLuyThuaCua2 = true;
        } else {
            // Lặp chừng nào n vẫn còn chia hết cho 2
            while (tempN % 2 == 0) {
                tempN = tempN / 2;
            }

            // Nếu là luỹ thừa của 2, kết quả cuối cùng phải là 1
            if (tempN != 1) {
                laLuyThuaCua2 = false;
            }
        }

        if (laLuyThuaCua2) {
            System.out.println(n + " LÀ luỹ thừa của 2.");
        } else {
            System.out.println(n + " KHÔNG PHẢI là luỹ thừa của 2.");
        }

        sc.close();
    }
}