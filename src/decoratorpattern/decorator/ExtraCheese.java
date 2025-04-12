package decoratorpattern.decorator;

import decoratorpattern.basepizza.Pizza;

public class ExtraCheese extends PizzaDecorator {

    public ExtraCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getPrice() {
        return this.basePizza.getPrice() + 50;
    }

    @Override
    public String getDescription() {
        return this.basePizza.getDescription() + ", Extra Cheese";
    }
}
