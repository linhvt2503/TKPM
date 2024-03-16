package A6_BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    //cài đặt singleton
    private static DataAccess instance;
    public static DataAccess getInstance(){
        if(instance == null){
            instance = new DataAccess();
        }
        return instance;
    }
    //
    List<SanPham> list = new ArrayList<>();
    public void add(SanPham s){
        list.add(s);
    }
}
