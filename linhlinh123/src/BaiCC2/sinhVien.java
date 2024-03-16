package BaiCC2;

public class sinhVien {
    String hoTen, ngaySinh;
    float DTB;

    @Override
    public String toString() {
        return "Họ và tên SV: " + hoTen + "\n" +
                "Ngày sinh: " + ngaySinh + "\n" +
                "Điểm trung bình: " + DTB + "\n";
    }

    public sinhVien(String hoTen, String ngaySinh, float DTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.DTB = DTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDTB() {
        return DTB;
    }

    public void setDTB(float DTB) {
        this.DTB = DTB;
    }
}
