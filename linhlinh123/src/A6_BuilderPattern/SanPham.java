package A6_BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class SanPham {
    //khai báo thuộc tính
    //hàm khởi tạo
    //phương thức toString()
    String maSP, tenSP;
    int soluong;
    double dongia;
    List<SanPham> list = new ArrayList<>();

    public SanPham(String maSP, String tenSP, int soluong, double dongia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mã sản phẩm: ").append(maSP).append("\n")
                .append("Tên sản phẩm: ").append(tenSP).append("\n")
                .append("Số lượng: ").append(soluong).append("\n")
                .append("Đơn giá: ").append(dongia).append("\n");
        for (SanPham s: list)
            builder.append("\n")
                    .append(s.toString());
        return builder.toString();
    }
}
