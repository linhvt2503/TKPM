package BTA4.F88;

public class ChuTich extends ChoVayF88{
    public ChuTich(int hanMucXuLyVay, String ten, String chucVu) {
        super(hanMucXuLyVay, ten, chucVu);
    }

    @Override
    public ChoVayF88 capCaoHon(ChoVayF88 capCao) {
        return null;
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
        return "Không có xèng";
    }
}
