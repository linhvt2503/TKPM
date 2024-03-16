package b1;

public class Tru extends BieuThucDecorator{
    float toanHang;

    @Override
    public float giaTri() {
        return super.giaTri()-toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + bieuThuc.bieuThuc() + "-" + String.valueOf(toanHang);
    }

    public Tru(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }
}
