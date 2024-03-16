package A6_BuilderPattern;

public class UI1 {
    public void  add(SanPham s){
        //lấy một đối tượng DataAccess: getInstance
        var d = DataAccess.getInstance();
        //gọi phương thức add trên đối tượng vừa lấy
        d.add(s);
    }
    public void add(SanPham s, String tag){
        //Lays một đối tượng DataAccessUpgrade: getInstance
        var du = DataAccessUpgrade.getInstance(tag);
        //gọi phương thức add trên đối tượng vừa lấy
        du.add(s);
    }
}
