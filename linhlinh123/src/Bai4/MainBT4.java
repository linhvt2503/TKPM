package Bai4;

public class MainBT4 {
    public static void main(String[] args) {
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        qlcx.Them(new ChuyenxeNoiThanh("001", "Dức Thắng","79A-115",150000,1,10));
        qlcx.Them(new ChuyenxeNoiThanh("002", "Dức Thịnh","79A-116",50000,2,5));
        qlcx.Them(new ChuyenxeNoiThanh("003", "Dức Tín","79A-117",350000,3,25));
        qlcx.Them(new ChuyenxeNoiThanh("004", "Dức Minh","79A-118",250000,4,15));

        qlcx.Them(new ChuyenxeNgoaiThanh("005", "Dức Thắng","79A-115",350000,"Sài Gon",1));
        qlcx.Them(new ChuyenxeNgoaiThanh("006", "Dức Thắng","79A-115",200000,"Nha Trang",10));
        qlcx.Them(new ChuyenxeNgoaiThanh("007", "Dức Thắng","79A-115",100000,"Gia Lai",10));
        qlcx.Them(new ChuyenxeNgoaiThanh("008", "Dức Thắng","79A-115",300000,"Hòa Bình",10));

        qlcx.inDSCX();
        System.out.println("Doanh thu xe nội thành: " + qlcx.doanhThuXeNoiThanh());
        System.out.println("Doanh thu xe ngoại thành: " + qlcx.doanhThuXeNgoaiThanh());
    }
}
