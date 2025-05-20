package ss3_Array_va_Method.bai_tap;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử N: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Nhập phần tử cần xoá X: ");
        int X = scanner.nextInt();
        int index_del = -1;
        for (int i = 0; i < N; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }
        if (index_del == -1) {
            System.out.println("Không tìm thấy phần tử " + X + " trong mảng.");
        } else {
            System.out.println("Tìm thấy " + X + " tại vị trí " + index_del);

        }
        for (int i = index_del; i < N - 1; i++) {
            array[i] = array[i + 1];
        }

        N--;

        System.out.println("Mảng sau khi xoá phần tử " + X + ":");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}


