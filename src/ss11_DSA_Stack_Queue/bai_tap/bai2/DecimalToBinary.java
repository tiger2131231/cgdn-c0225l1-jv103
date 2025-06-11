package ss11_DSA_Stack_Queue.bai_tap.bai2;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thập phân: ");
        int number = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();

        if (number == 0) {
            System.out.println("Số nhị phân: 0");
            return;
        }

        while (number > 0) {
            int remainder = number % 2;
            stack.push(remainder);
            number /= 2;
        }

        System.out.print("Số nhị phân: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
