package BTA4.F88;

public class MainF88 {
    public static void main(String[] args) {
        ChoVayF88 baoVe = new NhanVien("Linh Thủm","Bảo vệ",20_000_000);
        ChoVayF88 taiXe = new NhanVien("Linh Bủm","Tài xế",30_000_000);
        ChoVayF88 nvVP = new NhanVien("Linh Bẹp","Nhân Viên",10_000_000);
        ChoVayF88 chutich = new NhanVien("Thùy Linh","Chủ tịch",100_000_000);
        baoVe.capCaoHon(taiXe)
                .capCaoHon(nvVP)
                .capCaoHon(chutich);
        System.out.println(baoVe.xuLyVay(5_000_000));
        System.out.println(chutich.xuLyVay(90_000_000));
    }
}
