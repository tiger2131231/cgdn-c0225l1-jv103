package ss2_vong_lap_java.bai_tap;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        // Bước 1: Nhập số lượng số nguyên tố cần in
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in: ");
        int numbers = scanner.nextInt();

        // Bước 2: Khai báo biến count để đếm số nguyên tố đã in
        int count = 0;

        // Bước 3: Khai báo biến N để kiểm tra từng số
        int N = 2;

        // Bước 4: Duyệt và in ra các số nguyên tố
        while (count < numbers) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }

        scanner.close();
    }
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
