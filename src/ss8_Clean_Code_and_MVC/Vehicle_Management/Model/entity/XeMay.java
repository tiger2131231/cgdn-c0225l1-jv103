package ss8_Clean_Code_and_MVC.Vehicle_Management.Model.entity;

public class XeMay extends Vehicle {
    private int congSuat;

    public XeMay(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Xe Máy - Biển: " + bienKiemSoat + ", Hãng: " + tenHangSanXuat +
                ", Năm: " + namSanXuat + ", Chủ: " + chuSoHuu + ", Công suất: " + congSuat + "cc");
    }

    public int getCongSuat() {
        return congSuat;
    }
}

