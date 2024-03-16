package bt_java.BT1;

public class NhanVien {
    String ten, diachi;
    int tuoi, time;
    double luong;

    public NhanVien() {
    }

    public NhanVien(String ten, String diachi, int tuoi, int time, double luong) {
        this.ten = ten;
        this.diachi = diachi;
        this.tuoi = tuoi;
        this.time = time;
        this.luong = luong;
    }
    public double tinhThuong() {
        if (time >= 200) {
            return luong * 0.2;
        } else if (time >= 100) {
            return luong * 0.1;
        } else {
            return 0;
        }
    }
    public String getThongTin() {
        return "Tên: " + ten +
                "\nTuổi: " + tuoi +
                "\nĐịa chỉ: " + diachi +
                "\nTiền lương: " + luong +
                "\nTổng số giờ làm: " + time;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setTime(int time) {
        this.time = time;
    }
    double tinhluong(){
        if(time>=200)
            return luong*0.2;
        if(time>=100)
            return luong*0.1;
        return  0;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getTen() {
        return ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public int getTime() {
        return time;
    }

    public double getLuong() {
        return luong;
    }
}
