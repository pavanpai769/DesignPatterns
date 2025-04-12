package decoratorpattern.basepizza;

public class VeggieDelightPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Veggie Delight Pizza";
    }

    @Override
    public int getPrice() {
        return 130;
    }
}
