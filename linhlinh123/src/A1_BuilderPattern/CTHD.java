package A1_BuilderPattern;

public class CTHD {
    String tenSP;
    int soluong;
    double dongia;
    float chietkhau;

    public CTHD(String tenSP, int soluong, double dongia, float chietkhau) {
        this.tenSP = tenSP;
        this.soluong = soluong;
        this.dongia = dongia;
        this.chietkhau = chietkhau;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(tenSP).append("\t")
                .append("số lượng: ").append(soluong)
                .append("đơn giá: ").append(dongia)
                .append("chiết khấu: ").append(chietkhau);
        return builder.toString(); //trả về builder dạng chuỗi
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

    public float getChietkhau() {
        return chietkhau;
    }

    public void setChietkhau(float chietkhau) {
        this.chietkhau = chietkhau;
    }
}
