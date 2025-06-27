package ss8_Clean_Code_and_MVC.Vehicle_Management.Model.entity;

import ss8_Clean_Code_and_MVC.Vehicle_Management.Controller.HangSanXuat;

public class XeMay extends PhuongTien {
    private double congSuat;

    public XeMay(String bienKiemSoat, HangSanXuat hangSanXuat, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    @Override
    public String layThongTin() {
        return super.toString() + ", Công suất: " + congSuat;
    }
}
