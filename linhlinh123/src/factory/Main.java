package factory;

public class Main {
    public static void main(String[] args) {
        PizzaStore vnpizzaStore = new VN_PizzaStore();
        PizzaStore kpizzaStore = new Korean_PizzaStore();
        Pizza p = vnpizzaStore.order(PizzaType.HAI_SAN);
        Pizza k = kpizzaStore.order(PizzaType.HAI_SAN);
        System.out.println(k.toString());
    }
}
