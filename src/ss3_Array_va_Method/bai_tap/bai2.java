package ss3_Array_va_Method.bai_tap;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử N: ");
        int N = scanner.nextInt();
        int[] array = new int[N + 1];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Nhập số cần chèn X: ");
        int X = scanner.nextInt();
        System.out.print("Nhập vị trí cần chèn (index): ");
        int index = scanner.nextInt();
        if (index < 0 || index > N) {
            System.out.println("Không chèn được phần tử vào mảng. Vị trí không hợp lệ.");
        } else {
            for (int i = N; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = X;
            N++;

            System.out.println("Mảng sau khi chèn:");
            for (int i = 0; i < N; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
