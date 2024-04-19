package BT4;

public class MainHocTap {
    public static void main(String[] args) {
        KeHoachHocTap khht = new KeHoachChung("Năm 1");
        KeHoachHocTap k1 = new MonHoc("Toán 1",3,300);
        KeHoachHocTap k2 = new MonHoc("Đại số TT",3,350);
        khht.add(k1);
        khht.add(k2);
        System.out.println(khht.THongTin());
    }
}
