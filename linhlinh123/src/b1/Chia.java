package b1;

public class Chia extends BieuThucDecorator{
    int toanHang;

    @Override
    public float giaTri() {
        return super.giaTri() / toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + bieuThuc.bieuThuc() + "/" + String.valueOf(toanHang);
    }

    public Chia(BieuThuc bieuThuc, int toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }
}
