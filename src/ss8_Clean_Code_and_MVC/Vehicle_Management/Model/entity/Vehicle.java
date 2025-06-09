package ss8_Clean_Code_and_MVC.Vehicle_Management.Model.entity;

public abstract class Vehicle {
    protected String bienKiemSoat;
    protected String tenHangSanXuat;
    protected String namSanXuat;
    protected String chuSoHuu;

    public Vehicle(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public abstract void hienThiThongTin();
}

