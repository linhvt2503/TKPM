package ObserverPattern;

public class TigiaUSD extends Tigia{
    @Override
    public void notify(double delta) {
        for(TigiaObserver observer : observers){
            observer.tigiaChanged(delta);
        }
    }
}
