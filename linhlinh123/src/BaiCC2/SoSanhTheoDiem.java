package BaiCC2;

public class SoSanhTheoDiem implements ISoSanh<sinhVien>{
    @Override
    public int soSanh(sinhVien t1, sinhVien t2) {
        if(t1.DTB>t2.DTB)
            return 1;
        if(t1.DTB == t2.DTB)
            return 0;
        return -1;
    }
}
