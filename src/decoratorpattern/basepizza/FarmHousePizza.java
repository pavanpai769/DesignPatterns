package decoratorpattern.basepizza;

public class FarmHousePizza implements Pizza {

    @Override
    public String getDescription() {
        return "Farm House Pizza";
    }

    @Override
    public int getPrice() {
        return 150;
    }
}
