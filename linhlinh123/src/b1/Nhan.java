package b1;

public class Nhan extends BieuThucDecorator{
    int toanHang;

    @Override
    public float giaTri() {
        return super.giaTri() * toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + bieuThuc.bieuThuc() + "*" + String.valueOf(toanHang);
    }

    public Nhan(BieuThuc bieuThuc, int toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }
}
