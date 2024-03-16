package File;

public class MainB3 {
    public static void main(String[] args) {
        AbstractFile missLinh = new Folder("Miss Linh","02-05-2003");
        AbstractFile MTP = new Folder("Sơn Tùng MTP","11-11-1956");
        AbstractFile missGrand = new Folder("Miss Grand","11-11-2021");
        missLinh.add(missGrand);
        missGrand.add(MTP);

        System.out.println(missLinh.getPath());
        System.out.println(missLinh.getStringTreeFolder());
    }
}
