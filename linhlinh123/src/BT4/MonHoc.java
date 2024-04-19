package BT4;

public class MonHoc extends KeHoachHocTap{
    int soTC, hocPhiTC;

    public MonHoc(String ten, int soTC, int hocPhiTC) {
        super(ten);
        this.soTC = soTC;
        this.hocPhiTC = hocPhiTC;
    }

    @Override
    public int soTC() {
        return soTC;
    }

    @Override
    public int hocPhi() {
        return hocPhiTC;
    }

    @Override
    public String THongTin() {
        StringBuilder builder = new StringBuilder();
        builder.append("Môn học:\t").append(ten)
                .append("\tSố TC:\t").append(soTC)
                .append("\tHọc phí:\t").append(hocPhiTC);
        return builder.toString();
    }

    @Override
    public void add(KeHoachHocTap k) {

    }

    @Override
    public void remove(KeHoachHocTap k) {

    }
}
