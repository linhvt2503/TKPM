package BaiCC2;

public class MainCC2 {
    public static void main(String[] args) {
        QLSinhVien qlsv = new QLSinhVien();
        qlsv.themSV(new sinhVien("Võ Thùy Linh","02-05-2003",6.2F));
        qlsv.themSV(new sinhVien("Võ Thùy Dung","03-05-2003",7));
        qlsv.themSV(new sinhVien("Võ Thùy Mai","04-05-2003",6));
        qlsv.themSV(new sinhVien("Võ Thùy Kim","05-05-2003",5.5F));
        qlsv.themSV(new sinhVien("Võ Thùy Quỳnh","06-05-2003",6.6F));
        qlsv.setsosanh(new SoSanhTheoDiem()).sapXep();
        qlsv.inDS();
    }
}
