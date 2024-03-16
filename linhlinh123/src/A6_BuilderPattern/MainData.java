package A6_BuilderPattern;

public class MainData {
    public static void main(String[] args) {
        SanPham sanPham = new SanPham("123","watch",20,900);
        UI1 u1 = new UI1();
        u1.add(sanPham,"pipo");
        System.out.println(sanPham.toString());
    }
}
