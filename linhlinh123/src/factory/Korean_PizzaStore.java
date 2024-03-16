package factory;

public class Korean_PizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType){
            case HAI_SAN -> {
                return new Korean_PizzaHaisan();
            }
        }
        return null;
    }
}
