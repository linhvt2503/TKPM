package CA5_ATM;

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan linh = new TaiKhoan("Linh",1000,atm);
        System.out.println("Lần 1");
        atm.rutTien(500);
        System.out.println("Lần 2");
        linh.duatheVaoATM();
        atm.rutTien(500);
        System.out.println("lần 3");
        atm.rutTien(600);
    }
}
