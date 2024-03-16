package creational;

public class MysingletonMain {
    public static void main(String[] args) {
        Mysingleton s1 = Mysingleton.getInstance();
        Mysingleton s2 = Mysingleton.getInstance();
        s1.inCount();//1
        s1.inCount();//2
        s2.inCount();//3
        s2.inCount();//4
    }
}
