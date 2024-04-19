package CA5_ATM;

public class TaiKhoan implements TaiKhoanATM{
    String tenTK;
    int soDu;
    ATM atm;

    public TaiKhoan(String tenTK, int soDu, ATM atm) {
        this.tenTK = tenTK;
        this.soDu = soDu;
        this.atm = atm;
    }
    public void duatheVaoATM(){
        atm.nhanThe(this);
    }
    public void ruttheKhoiATM(){
        atm.traThe(this);
    }
    public boolean kiemTraSoDu(int soTienRut){
        if(soDu - 50 > soTienRut)
            return true;
        return false;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        if(thanhCong == true){
            System.out.println("Tài Khoản:" + tenTK);
            System.out.println("Số dư tài khoản:"+soDu);
            System.out.println("Số tiền rút"+soTienRut);
            soDu = soDu = soTienRut;
            System.out.println("Số dư còn lại: "+soDu);
        }else{
            System.out.println("Tài Khoản:" + tenTK);
            System.out.println("Số dư tài khoản:"+soDu);
            System.out.println("Số tiền rút"+soTienRut);
            System.out.println("Không đủ tiền để rút");
        }
    }
}
