package BTB6;

public class Leaft extends BNode{
    BNode left;
    BNode right;
    public Leaft(int value) {
        super(value);
    }

    @Override
    void addL(BNode n) {
        this.left = n;
    }

    @Override
    void addR(BNode n) {
        this.right=n;
    }

    @Override
    void removeL(BNode n) {

    }

    @Override
    void removeR(BNode n) {

    }

    @Override
    String duyet() {
        StringBuilder builder = new StringBuilder();
        builder.append(value);
        return builder.toString();
    }
}
