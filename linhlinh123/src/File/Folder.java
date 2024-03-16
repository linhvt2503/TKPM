package File;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
    List<AbstractFile> children = new ArrayList<>();
    public Folder(String tenfile, String ngaytao) {
        super(tenfile, ngaytao);
    }

    @Override
    public void add(AbstractFile File) {
        children.add(File);
        File.duongDan = this.duongDan+"\\"+File.duongDan;
    }

    @Override
    public void remove(AbstractFile File) {
        children.remove(File);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.tenfile).append("\n");
        //ghép các cây con vào
        for (var f: children)
            builder.append("\n").append(f.getStringTreeFolder());
        return builder.toString();

    }

}
