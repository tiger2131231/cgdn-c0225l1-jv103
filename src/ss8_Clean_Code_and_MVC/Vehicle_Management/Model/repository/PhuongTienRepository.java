package ss8_Clean_Code_and_MVC.Vehicle_Management.Model.repository;

import ss8_Clean_Code_and_MVC.Vehicle_Management.Model.entity.HangSanXuat;
import ss8_Clean_Code_and_MVC.Vehicle_Management.Model.entity.PhuongTien;

import java.util.*;

public class PhuongTienRepository {
    public static List<PhuongTien> xeTaiList = new ArrayList<>();
    public static List<PhuongTien> otoList = new ArrayList<>();
    public static List<PhuongTien> xeMayList = new ArrayList<>();

    public static List<HangSanXuat> hangSanXuatList = List.of(
            new HangSanXuat("HSX-001", "Yamaha", "Nhật Bản"),
            new HangSanXuat("HSX-002", "Honda", "Nhật Bản"),
            new HangSanXuat("HSX-003", "Dongfeng", "Trung Quốc"),
            new HangSanXuat("HSX-004", "Huyndai", "Hàn Quốc"),
            new HangSanXuat("HSX-005", "Ford", "Mỹ"),
            new HangSanXuat("HSX-006", "Toyota", "Nhật Bản"),
            new HangSanXuat("HSX-007", "Hino", "Nhật Bản")
    );
}
