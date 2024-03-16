package Bai4;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<Chuyenxe> list = new ArrayList<>();
    public void Them(Chuyenxe c){
        //Kiểm tra nếu đã có chuyến xe trong danh sách thì dừng
        for(Chuyenxe cx: list){
            if(cx.getMasoChuyen().equals(c.getMasoChuyen())) //equals so sánh bằng
                return;
            //Thêm chuyến xe nếu chưa có trong danh sach

        }
        list.add(c);
    }
    public float doanhThuXeNgoaiThanh(){
        float dt = 0;
        for(Chuyenxe c: list){
            if (c instanceof ChuyenxeNgoaiThanh)
                dt += c.getDoanhThu();
        }
        return dt;
    }
    public float doanhThuXeNoiThanh(){
        float dt = 0;
        for(Chuyenxe c: list){
            if(c instanceof ChuyenxeNoiThanh)
                dt += c.getDoanhThu();
        }
        return dt;
    }
    public float tongDoanhThu(){
        float dt = 0;
        for(Chuyenxe c: list){
            dt += c.getDoanhThu();
        }
        return dt;
    }
    public void inDSCX(){
        for(Chuyenxe c: list)
            System.out.println(c.toString());
    }
}
