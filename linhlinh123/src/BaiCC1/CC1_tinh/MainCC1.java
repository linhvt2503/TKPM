package BaiCC1.CC1_tinh;

public class MainCC1 {
    public static void main(String[] args) {
        Context c = new Context();
        c.setTinh(new Cong()).tinh(3,5);
        float tg1 = c.setTinh(new Cong()).tinh(3,5);
        float kq = c.setTinh(new Nhan()).tinh(tg1,7);
        float kq2 = c.setTinh(new Tru()).tinh(20, 10);
        float kq3 = c.setTinh(new Chia()).tinh(20, 10);
        System.out.println(kq);
    }
}
