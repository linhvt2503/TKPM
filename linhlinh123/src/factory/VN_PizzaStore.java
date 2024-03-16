package factory;

import java.lang.runtime.SwitchBootstraps;

public class VN_PizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType){
            case HAI_SAN -> {
                return new VN_PizzaHaisan();
            }
        }
        return null;
    }
}
