package ss14_Arrangement_algorithm.bai_tap.Insertion_sort_algorithm_implementation_Assignment;

import java.util.Scanner;

public class IncreasingSubstringFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String longest = "";
        String current = "";

        for (int i = 0; i < input.length(); i++) {
            if (current.isEmpty() || input.charAt(i) > current.charAt(current.length() - 1)) {
                current += input.charAt(i);
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "" + input.charAt(i);
            }
        }

        if (current.length() > longest.length()) {
            longest = current;
        }

        System.out.println("Longest increasing substring: " + longest);
    }
}

