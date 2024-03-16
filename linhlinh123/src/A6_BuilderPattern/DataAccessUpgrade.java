package A6_BuilderPattern;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class DataAccessUpgrade {
    //singleton
    private static Dictionary<String, DataAccessUpgrade> instance = new Hashtable<>();
    public static DataAccessUpgrade getInstance(String tag){
        if(instance.get(tag) == null){
            DataAccessUpgrade d = new DataAccessUpgrade();
            instance.put(tag,d);
        }
        return instance.get(tag);
    }
    //
    List<SanPham> list = new ArrayList<>();
    public void add(SanPham s){
        list.add(s);
    }
}
