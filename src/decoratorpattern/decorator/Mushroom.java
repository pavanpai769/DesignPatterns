package decoratorpattern.decorator;

import decoratorpattern.basepizza.Pizza;

public class Mushroom extends PizzaDecorator {

    public Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return this.basePizza.getDescription() + ", Extra Mushroom";
    }

    @Override
    public int getPrice() {
        return this.basePizza.getPrice() + 15;
    }
}
