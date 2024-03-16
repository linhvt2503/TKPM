package A1_BuilderPattern;

public class HoaDonHeader {
    String maHD;
    String ngayban;
    String tenKH;

    public HoaDonHeader(String maHD, String ngayban, String tenKH) {
        this.maHD = maHD;
        this.ngayban = ngayban;
        this.tenKH = tenKH;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayban() {
        return ngayban;
    }

    public void setNgayban(String ngayban) {
        this.ngayban = ngayban;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
}
