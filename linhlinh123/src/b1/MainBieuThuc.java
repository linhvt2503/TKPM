package b1;

public class MainBieuThuc {
    public static void main(String[] args) {
        BieuThuc bt = new BieuThucDonGian(6);
        bt = new Cong(bt,9);
        bt = new Nhan(bt,8);
        bt = new Cong(bt,5);
        System.out.println(bt.bieuThuc()+"=" +bt.giaTri());

        BieuThuc bt1 = new BieuThucDonGian(8);
        bt1 = new Cong(bt1,6);
        bt1 = new Chia(bt1,2);
        bt1 = new Nhan(bt1, 5);
        bt1 = new Cong(bt1,8);
        bt1 = new Tru(bt1, 4);
        System.out.println(bt1.toString());
    }
}
