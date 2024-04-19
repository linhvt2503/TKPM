package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        Tigia t = new TigiaUSD();
        NhaDauTu a = new NhaDauTu(t);
        NhaDauTuB b = new NhaDauTuB(t);
        a.dangki();b.dangki();
        System.out.println("Thông báo lần 1:");
        t.notify(-1);
        b.huydangki();
        System.out.println("Thông báo lần 2:");
        t.notify(1);
        b.huydangki();
    }
}
