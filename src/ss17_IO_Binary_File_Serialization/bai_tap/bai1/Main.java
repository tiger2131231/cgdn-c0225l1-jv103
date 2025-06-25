package ss17_IO_Binary_File_Serialization.bai_tap.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị tất cả sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm theo tên");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                choice = -1;
            }

            switch (choice) {
                case 1:
                    System.out.print("Mã sản phẩm: ");
                    String id = scanner.nextLine();
                    System.out.print("Tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Giá: ");
                    double price;
                    try {
                        price = Double.parseDouble(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Giá không hợp lệ!");
                        break;
                    }
                    System.out.print("Hãng sản xuất: ");
                    String manufacturer = scanner.nextLine();
                    System.out.print("Mô tả: ");
                    String description = scanner.nextLine();

                    Product p = new Product(id, name, price, manufacturer, description);
                    manager.addProduct(p);
                    System.out.println(" Đã thêm sản phẩm.");
                    break;
                case 2:
                    manager.displayAll();
                    break;
                case 3:
                    System.out.print("Nhập từ khóa tên sản phẩm: ");
                    String keyword = scanner.nextLine();
                    manager.searchByName(keyword);
                    break;
                case 0:
                    System.out.println(" Thoát chương trình.");
                    break;
                default:
                    System.out.println(" Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);
    }
}