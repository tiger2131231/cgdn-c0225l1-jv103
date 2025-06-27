package ss8_Clean_Code_and_MVC.Vehicle_Management.Model.service;


import ss8_Clean_Code_and_MVC.Vehicle_Management.Model.entity.PhuongTien;
import ss8_Clean_Code_and_MVC.Vehicle_Management.Model.repository.PhuongTienRepository;

import java.util.*;

public class PhuongTienService {
    public void themMoi(PhuongTien phuongTien, String loai) {
        switch (loai) {
            case "xeTai" -> PhuongTienRepository.xeTaiList.add(phuongTien);
            case "oto" -> PhuongTienRepository.otoList.add(phuongTien);
            case "xeMay" -> PhuongTienRepository.xeMayList.add(phuongTien);
        }
    }

    public void hienThi(String loai) {
        List<PhuongTien> list = switch (loai) {
            case "xeTai" -> PhuongTienRepository.xeTaiList;
            case "oto" -> PhuongTienRepository.otoList;
            case "xeMay" -> PhuongTienRepository.xeMayList;
            default -> List.of();
        };
        list.forEach(p -> System.out.println(p.layThongTin()));
    }

    public boolean xoaPhuongTien(String bienSo) {
        List<List<PhuongTien>> allLists = List.of(
                PhuongTienRepository.xeTaiList,
                PhuongTienRepository.otoList,
                PhuongTienRepository.xeMayList
        );
        for (List<PhuongTien> list : allLists) {
            Optional<PhuongTien> match = list.stream()
                    .filter(p -> p.getBienKiemSoat().equalsIgnoreCase(bienSo))
                    .findFirst();
            if (match.isPresent()) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Bạn có muốn xóa? (Yes/No): ");
                if (sc.nextLine().equalsIgnoreCase("Yes")) {
                    list.remove(match.get());
                    System.out.println("Đã xóa thành công.");
                    return true;
                } else {
                    System.out.println("Đã hủy xóa.");
                    return false;
                }
            }
        }
        System.out.println("Không tìm thấy phương tiện.");
        return false;
    }
}