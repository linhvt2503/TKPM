package behavioral.stratery.duck;

public class mainVitquay {
    public static void main(String[] args) {
        duck ducks = new Vitquay();
        ducks.setFlyBehavior(new BaytrenLothan());
        ducks.setQuackBehavior(new VitquayKeu());
        ducks.display();
    }
}
