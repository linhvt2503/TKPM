package factory;

public abstract class PizzaStore {
    abstract Pizza createPizza(PizzaType pizzaType);
    Pizza order(PizzaType pizzaType){
        Pizza p = createPizza(pizzaType);
        p.prepare();
        p.bake();
        p.box();
        p.cut();
        return p;
    }
}
