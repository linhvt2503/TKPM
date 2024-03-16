package BaiCC1.CC1_tinh;

public class Context {
    //sử dụng thành phần tùy biến thông qua một đối tượng đại diện
    private Tinh tinh;
    //setter được dử dụng để gán một đối tượng cụ thể cho biến đaại diện khi sử dụng
    public Context setTinh(Tinh tinh) {
        this.tinh = tinh;
        return this;
    }

    public float tinh(float a, float b){
        return tinh.tinh(a,b);
    }
}
