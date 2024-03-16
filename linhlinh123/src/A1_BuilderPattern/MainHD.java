package A1_BuilderPattern;

public class MainHD {
    public static void main(String[] args) {
        HoaDonHeader hoaDonHeader = new HoaDonHeader("123","12/2/2024","Thị Thập");
        CTHD cthd1 = new CTHD("hoa hồng",100,1500,5);
        CTHD cthd2 = new CTHD("hoa cúc",100,1000,5);
        HoaDon hoaDon = new HoaDon.Builder()
                .setHoadonhedar(hoaDonHeader)
                .addCTHD(cthd1)
                .addCTHD(cthd2)
                .build();
        System.out.println(hoaDon.toString());
    }
}
