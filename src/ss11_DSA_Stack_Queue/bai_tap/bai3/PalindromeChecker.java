package ss11_DSA_Stack_Queue.bai_tap.bai3;
import java.util.*;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {

        String normalized = input.replaceAll("\s+", "").toLowerCase();


        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();


        for (char ch : normalized.toCharArray()) {
            queue.add(ch);
            stack.push(ch);
        }


        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "madam";
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" là chuỗi Palindrome.");
        } else {
            System.out.println("\"" + input + "\" không phải là chuỗi Palindrome.");
        }
    }
}
