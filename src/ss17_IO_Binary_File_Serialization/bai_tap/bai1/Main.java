package ss17_IO_Binary_File_Serialization.bai_tap.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị tất cả sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm theo tên");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Mã: ");
                    String id = sc.nextLine();
                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    System.out.print("Giá: ");
                    double price = Double.parseDouble(sc.nextLine());
                    System.out.print("Hãng: ");
                    String manufacturer = sc.nextLine();
                    System.out.print("Mô tả: ");
                    String desc = sc.nextLine();
                    Product p = new Product(id, name, price, manufacturer, desc);
                    manager.addProduct(p);
                    break;
                case 2:
                    manager.displayAll();
                    break;
                case 3:
                    System.out.print("Nhập tên sản phẩm cần tìm: ");
                    String keyword = sc.nextLine();
                    manager.searchByName(keyword);
                    break;
            }

        } while (choice != 0);
    }
}
