package File;

import java.io.File;
import java.util.List;

public abstract class AbstractFile {
    public abstract void add(AbstractFile File);
    public abstract void remove(AbstractFile File);
    String tenfile, ngaytao;
    String duongDan;

    public AbstractFile(String tenfile, String ngaytao) {
        this.tenfile = tenfile;
        this.ngaytao = ngaytao;
        this.duongDan = tenfile; //cập nhật đường dẫn đến tên file
    }

    public abstract String getStringTreeFolder();
    public String getPath(){
        return duongDan;
    }
}
