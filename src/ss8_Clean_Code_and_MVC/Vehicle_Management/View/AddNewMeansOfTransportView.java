package ss8_Clean_Code_and_MVC.Vehicle_Management.View;

import ss8_Clean_Code_and_MVC.Vehicle_Management.Model.entity.XeTai;
import ss8_Clean_Code_and_MVC.Vehicle_Management.Model.repository.XeTaiRepository;

import java.util.Scanner;

public class AddNewMeansOfTransportView {
    private static XeTaiRepository XetaiController;

    public static void displayFunction1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Thêm xe tải");
        System.out.println("2. Thêm ô tô");
        System.out.println("3. Thêm xe máy");
        System.out.println("4. Quay lại giao diện chính");
        int choice = Integer.parseInt(scanner.nextLine());
        switch(choice){
            case 1:
                XeTai xetai = inputXetai();
                XetaiController.add(xetai);
                System.out.println("Thêm mới thành công");
                break;
                case 2:
        }
    }

    private static XeTai inputXetai() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên biến kiểm soát");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập tên hãng sản xuất");
        String tenHangSanXuat = scanner.nextLine();
        System.out.println("NHập năm sản xuất");
        String namSanXuat = scanner.nextLine();
        System.out.println("Nhập tên chủ Sỡ Hữu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập tên trọng tải");
        double trongTai = scanner.nextDouble();
      return new XeTai(bienKiemSoat,tenHangSanXuat,namSanXuat,chuSoHuu,trongTai);
    }
}

