package CA5_ATM;

public class ATM {
    TaiKhoanATM theATM;
    void nhanThe(TaiKhoanATM atm){
        theATM = atm;
    }
    void traThe(TaiKhoanATM atm){
        theATM = null;
    }
    public void rutTien(int soTien){
        if(theATM != null){
            if(theATM.kiemTraSoDu(soTien) == true){
                theATM.nhanThongBao(soTien,true);
            }
        }else {
            theATM.nhanThongBao(soTien,false);
        }
    }
}
