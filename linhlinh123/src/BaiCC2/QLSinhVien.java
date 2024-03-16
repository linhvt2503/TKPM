package BaiCC2;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import BaiCC2.sinhVien;
public class QLSinhVien {
    ISoSanh soSanh;
    List<sinhVien> list = new ArrayList<>();

    public void themSV(sinhVien s){
        list.add(s);
    }
    public QLSinhVien setsosanh (ISoSanh sosanh){
        this.soSanh = sosanh;
        return this;
    }
    public void sapXep(){
        for(int i = 0; i < list.size()-1; i++){
            for(int j = i + 1; j < list.size(); j++)
                //nếu phần tử i lớn hơn phần tử j
                if(soSanh.soSanh(list.get(i), list.get(j)) > 1){
                    //chuyển j về i
                    sinhVien s = list.get(i); //lấy bản sao phần tử i
                    list.set(i, list.get(j));//lấy bản sao phần tử j đặt vào vị trí i
                    list.set(j, s);//lấy s đặt vào j
                }
        }
    }
    public void sapXep2(){
        list.sort((o1, o2) -> soSanh.soSanh(o1,o2));
    }
    public void inDS(){
        for(sinhVien s: list)
            System.out.println(s.toString());
    }
}
