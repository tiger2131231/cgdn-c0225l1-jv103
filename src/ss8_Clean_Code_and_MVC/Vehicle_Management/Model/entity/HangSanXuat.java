package ss8_Clean_Code_and_MVC.Vehicle_Management.Model.entity;

public class HangSanXuat {
    private String maHang;
    private String tenHang;
    private String quocGia;

    public HangSanXuat(String maHang, String tenHang, String quocGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.quocGia = quocGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public String getQuocGia() {
        return quocGia;
    }

    @Override
    public String toString() {
        return tenHang + " (" + quocGia + ")";
    }
}

