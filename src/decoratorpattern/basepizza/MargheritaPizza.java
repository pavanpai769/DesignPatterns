package decoratorpattern.basepizza;

public class MargheritaPizza implements Pizza {

    @Override
    public String getDescription() {
        return "MargheritaPizza";
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
