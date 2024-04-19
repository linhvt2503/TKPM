package BTA4.F88;

public class NhanVien extends ChoVayF88{
    ChoVayF88 capCaoHon;
    public NhanVien(String ten, String chucVu, int hanMucXuLyVay) {
        super(hanMucXuLyVay, ten, chucVu);
    }

    @Override
    public ChoVayF88 capCaoHon(ChoVayF88 capCao) {
        capCaoHon = capCao;
        return capCao;
    }

    @Override
    public String xuLyVay(int soTienVay) {
        if (soTienVay < hanMucXuLyVay){
            StringBuilder builder = new StringBuilder();
            builder.append(chucVu).append(" ").append(ten)
                    .append(" duyệt số tiền vay: ").append(soTienVay)
                    .append(". Nhớ trả tiền lãi đúng hạn!");
            return builder.toString();
        }
        return capCaoHon.xuLyVay(soTienVay);
    }
}
