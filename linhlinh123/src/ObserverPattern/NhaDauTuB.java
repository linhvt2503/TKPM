package ObserverPattern;

public class NhaDauTuB implements Tigia.TigiaObserver{
    Tigia t;

    public NhaDauTuB(Tigia t) {
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
            System.out.println("Nhà đầu tư B: Mua vao");
        }
        else {
            System.out.println("Nhà đầu tư B: Baán ra");
        }
    }
}
