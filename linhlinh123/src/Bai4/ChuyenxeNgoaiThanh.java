package Bai4;
//Công ty vận tải V quản lý thông tin là các chuyến xe. Thông tin của 2 loại chuyến xe:
//        - Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh
//thu.
//- Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi, doanh thu.
public class ChuyenxeNgoaiThanh extends Chuyenxe{
    String noiDen;
    int soNgayDi;

    public ChuyenxeNgoaiThanh(String masoChuyen, String taixe, String soXe, float doanhThu, String noiDen, int soNgayDi) {
        super(masoChuyen, taixe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    @Override
    public String toString() {
        String st = super.toString();
        st = st+"Nơi đến: " + noiDen + "\n" +
                "Số ngày đi: " + soNgayDi + "\n" ;
        return st;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }
}
