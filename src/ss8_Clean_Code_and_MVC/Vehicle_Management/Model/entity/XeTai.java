package ss8_Clean_Code_and_MVC.Vehicle_Management.Model.entity;

public class XeTai extends Vehicle {
    private double trongTai;

    public XeTai(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Xe Tải - Biển: " + bienKiemSoat + ", Hãng: " + tenHangSanXuat +
                ", Năm: " + namSanXuat + ", Chủ: " + chuSoHuu + ", Trọng tải: " + trongTai + " tấn");
    }

    public double getTrongTai() {
        return trongTai;
    }
}

