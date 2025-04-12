package decoratorpattern.decorator;

import decoratorpattern.basepizza.Pizza;

public class Jalapeno extends PizzaDecorator {

    public Jalapeno(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return this.basePizza.getDescription() + ", Extra Jalapeno";
    }

    @Override
    public int getPrice() {
        return this.basePizza.getPrice() + 7;
    }
}
