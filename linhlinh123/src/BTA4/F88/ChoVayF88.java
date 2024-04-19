package BTA4.F88;

public abstract class ChoVayF88 {
    int hanMucXuLyVay;
    String ten, chucVu;

    public ChoVayF88(int hanMucXuLyVay, String ten, String chucVu) {
        this.hanMucXuLyVay = hanMucXuLyVay;
        this.ten = ten;
        this.chucVu = chucVu;
    }
    public abstract ChoVayF88 capCaoHon(ChoVayF88 capCao);
    public abstract String xuLyVay(int soTienVay);
}
