package behavioral.stratery.duck;

public class Vitquay extends duck{

    @Override
    public void display() {
        System.out.println("Tôi la vit");
        performFly();
        performQuack();
        swim();
    }
}
