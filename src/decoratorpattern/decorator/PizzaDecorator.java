package decoratorpattern.decorator;

import decoratorpattern.basepizza.Pizza;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza basePizza;

    public PizzaDecorator(Pizza basePizza) {
        this.basePizza = basePizza;
    }

    abstract public int getPrice();

    abstract public String getDescription();
}
