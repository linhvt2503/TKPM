package decorator;

public class MainBeverage {
    public static void main(String[] args) {
        Beverage b = new HouseBlend("Cafe TN số 1 TG");
        b = new Milk("sữa gái hà lan,",b);
        b = new Milk(" sữa ông thọ",b);
        System.out.println(b.getDescription());
        System.out.println(b.cost());
    }
}
