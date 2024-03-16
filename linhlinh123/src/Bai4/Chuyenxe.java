package Bai4;
//Công ty vận tải V quản lý thông tin là các chuyến xe. Thông tin của 2 loại chuyến xe:
//        - Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh
//thu.
//- Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi, doanh thu.
public abstract class Chuyenxe {
    String masoChuyen, taixe, soXe;
    float doanhThu;

    public Chuyenxe(String masoChuyen, String taixe, String soXe, float doanhThu) {
        this.masoChuyen = masoChuyen;
        this.taixe = taixe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMasoChuyen() {
        return masoChuyen;
    }

    public void setMasoChuyen(String masoChuyen) {
        this.masoChuyen = masoChuyen;
    }

    public String getTaixe() {
        return taixe;
    }

    public void setTaixe(String taixe) {
        this.taixe = taixe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public float getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(float doanhThu) {
        this.doanhThu = doanhThu;
    }

    @Override
    public String toString() {
        return "Mã số chuyến: " + masoChuyen + "\n" +
                "Tài xế: " + taixe + "\n" +
                "Số xe: " + soXe + "\n" +
                "Doanh thu: " + doanhThu + "\n";
    }
}
