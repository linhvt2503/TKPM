package BTB6;

public class InnerNode extends BNode{
    BNode left;
    BNode right;

    public InnerNode(int value) {
        super(value);
    }

    @Override
    void addL(BNode n) {
        this.left = n;
    }

    @Override
    void addR(BNode n) {
        this.right = n;
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
        if(left != null) {
            left.p = this.p + "\t";
            builder.append("\n\t").append(p)
                    .append(left.duyet());
        }
        if (right != null) {
            left.p = this.p + "\t";
            builder.append("\n\t").append(p)
                    .append(right.duyet());
        }
        return builder.toString();
    }
}
