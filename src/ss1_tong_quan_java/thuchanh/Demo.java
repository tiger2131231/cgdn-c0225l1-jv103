package ss1_tong_quan_java.thuchanh;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int i = 10;
//        float f = 20.0f;
//        double d = 20.0f;
//        boolean b = true;
//        char c = 'c';
//        float f2= 10.0f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập  tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("");
    }
}
