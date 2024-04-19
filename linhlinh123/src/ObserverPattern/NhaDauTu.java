package ObserverPattern;

public class NhaDauTu implements Tigia.TigiaObserver {
    Tigia t;

    public NhaDauTu(Tigia t) {
        this.t = t;
    }

    public void dangki(){
        t.attach(this);
    }
    public void huydangki(){
        t.detach(this);
    }
    public void tigiaChanged(double delta){
        if(delta < 0){
            System.out.println("Nhà đầu tư A: Bán ra");
        }
        else {
            System.out.println("Nhà đầu tư A: Mua vào");
        }
    }
}
