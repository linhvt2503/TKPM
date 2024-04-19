package BT4;

import java.util.ArrayList;
import java.util.List;

public class KeHoachChung extends KeHoachHocTap{
    public KeHoachChung(String ten) {
        super(ten);
    }
    List<KeHoachHocTap> list = new ArrayList<>();
    @Override
    public int soTC() {
        int t = 0;
        for (KeHoachHocTap k: list)
            t = t + k.soTC();
        return t;
    }

    @Override
    public int hocPhi() {
        int s = 0;
        for(KeHoachHocTap k:list)
            s = s + k.soTC()* k.hocPhi();
        return s;
    }

    @Override
    public String THongTin() {
        StringBuilder builder = new StringBuilder();
        builder.append(ten)
                .append("\tSố TC: ").append(soTC())
                .append("\tHọc phí: ").append(hocPhi());
        for (KeHoachHocTap k: list){
            k.p = this.p + "\t";
            builder.append("\n").append(k.p)
                    .append(k.THongTin());
            k.p="";
        }
        return builder.toString();
    }

    @Override
    public void add(KeHoachHocTap k) {
        list.add(k);
    }

    @Override
    public void remove(KeHoachHocTap k) {

    }
}
