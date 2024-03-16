package b1;

public abstract class BieuThuc {
    @Override
    public String toString() {
        return bieuThuc() + "=" + giaTri();
    }

    public abstract float giaTri();
    public abstract String bieuThuc();
}
