public class HangSanXuat {
    private String maHang;
    private String tenHang;
    private String quocGia;

    public HangSanXuat(String maHang, String tenHang, String quocGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.quocGia = quocGia;
    }

    public String getTenHang() {
        return tenHang;
    }

    public String getMaHang() {
        return maHang;
    }

    @Override
    public String toString() {
        return tenHang + " (" + quocGia + ")";
    }
}