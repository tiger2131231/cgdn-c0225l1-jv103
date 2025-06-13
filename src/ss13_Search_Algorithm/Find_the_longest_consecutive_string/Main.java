package ss13_Search_Algorithm.Find_the_longest_consecutive_string;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (!list.isEmpty() && string.charAt(i) <= list.getLast()) {
                list.clear();
            }

            list.add(string.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }

        System.out.print("Chuỗi con liên tiếp tăng dần dài nhất là: ");
        for (Character ch : max) {
            System.out.print(ch);
        }
    }
}
