package File;

public class File extends AbstractFile{
    public File(String tenfile, String ngaytao) {
        super(tenfile, ngaytao);
    }

    @Override
    public void add(AbstractFile File) {

    }

    @Override
    public void remove(AbstractFile File) {

    }

    @Override
    public String getStringTreeFolder() {
        return this.tenfile;
    }
}
