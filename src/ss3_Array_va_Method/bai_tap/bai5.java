package ss3_Array_va_Method.bai_tap;
import java.util.Scanner;

public class bai5 {
    public class TimGiaTriNhoNhat {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số lượng phần tử trong mảng (SIZE): ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            System.out.println("Nhập các phần tử:");
            for (int i = 0; i < size; i++) {
                System.out.print("array[" + i + "] = ");
                array[i] = scanner.nextInt();
            }
            int min = array[0];
            for (int i = 1; i < size; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
        }
    }

}
