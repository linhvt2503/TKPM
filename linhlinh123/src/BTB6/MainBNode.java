package BTB6;

public class MainBNode {
    public static void main(String[] args) {
        BNode l1 = new InnerNode(3);
        BNode l2 = new InnerNode(4);
        BNode l3 = new InnerNode(5);
        BNode l4 = new InnerNode(6);
        BNode l5 = new InnerNode(7);
        BNode l6 = new InnerNode(8);
        l1.addL(l2);
        l4.addR(l3);
        System.out.println(l1.duyet());
    }
}
