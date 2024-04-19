package BT4;

public abstract class KeHoachHocTap {
    String ten;
    String p="";
    public KeHoachHocTap(String ten) {
        this.ten = ten;
    }
    public abstract int soTC();
    public abstract int hocPhi();
    public abstract String THongTin();
    public abstract void add(KeHoachHocTap k);
    public abstract void remove(KeHoachHocTap k);
}
