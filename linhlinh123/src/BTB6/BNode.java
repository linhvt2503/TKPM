package BTB6;

public abstract class BNode {
    int value;
    String p = "";
    public BNode(int value) {
        this.value = value;
    }

    abstract void addL(BNode n);
    abstract void addR(BNode n);
    abstract void removeL(BNode n);
    abstract void removeR(BNode n);
    abstract String duyet();
}
