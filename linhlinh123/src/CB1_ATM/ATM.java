package CB1_ATM;

public abstract class ATM {
    int menhGia;
    int soTO;
    public ATM(int menhGia) {
        this.menhGia = menhGia;
    }

    public abstract ATM thisMenhGiaThapHon(ATM sim);
    public void rutTien(int soTien){

    }
}
