package ss1_tong_quan_java.baitap;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("MỜi bạn nhập số tiền USD mà bạn muốn quy đổi: ");
        usd = scanner.nextDouble();
        double rate = (usd * 23000);
        System.out.println("Giá trị của VND: " + rate + "VND");
    }
}
