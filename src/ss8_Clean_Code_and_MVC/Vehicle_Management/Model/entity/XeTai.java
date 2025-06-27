package ss8_Clean_Code_and_MVC.Vehicle_Management.Model.entity;

public class XeTai extends PhuongTien {
    private double trongTai;

    public XeTai(String bienKiemSoat, HangSanXuat hangSanXuat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    @Override
    public String layThongTin() {
        return super.toString() + ", Trọng tải: " + trongTai;
    }
}

