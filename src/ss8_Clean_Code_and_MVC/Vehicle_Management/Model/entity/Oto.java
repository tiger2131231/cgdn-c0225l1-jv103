package ss8_Clean_Code_and_MVC.Vehicle_Management.Model.entity;

public class Oto extends Vehicle {
    private int soChoNgoi;
    private String kieuXe;

    public Oto(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Ôtô - Biển: " + bienKiemSoat + ", Hãng: " + tenHangSanXuat +
                ", Năm: " + namSanXuat + ", Chủ: " + chuSoHuu + ", Kiểu xe: " + kieuXe + ", Số chỗ: " + soChoNgoi);
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }
}

