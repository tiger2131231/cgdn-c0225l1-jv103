package ss8_Clean_Code_and_MVC.Vehicle_Management.View;

import java.util.Scanner;

public class MainView {
    public static int displayMainView() {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
        System.out.println("Mời bạn chọn chức năng:");
        System.out.println("1. Thêm mới phương tiện");
        System.out.println("2. Hiện thị phương tiện");
        System.out.println("3. Xóa phương tiện");
        System.out.println("4. Thoát");
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

}
