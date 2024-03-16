package template_method;

import template_method.caffeinebeverage;
import template_method.coffee;

public class Maincoffee {
    public static void main(String[] args) {
        caffeinebeverage coffee = new coffee();
        coffee.prepareRecipe();
    }
}
