package decoratorpattern.main;

import decoratorpattern.basepizza.FarmHousePizza;
import decoratorpattern.basepizza.MargheritaPizza;
import decoratorpattern.basepizza.Pizza;
import decoratorpattern.basepizza.VeggieDelightPizza;
import decoratorpattern.decorator.ExtraCheese;
import decoratorpattern.decorator.Jalapeno;
import decoratorpattern.decorator.Mushroom;

public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = new VeggieDelightPizza();
        pizza1 = new ExtraCheese(pizza1);
        pizza1 = new Mushroom(pizza1);

        System.out.println("Pizza:- " + pizza1.getDescription());
        System.out.println("Total Cost:- " + pizza1.getPrice());
        System.out.println();

        Pizza pizza2 = new FarmHousePizza();
        pizza2 = new ExtraCheese(pizza2);
        pizza2 = new Jalapeno(pizza2);

        System.out.println("Pizza:- " + pizza2.getDescription());
        System.out.println("Total Cost:- " + pizza2.getPrice());
        System.out.println();

        Pizza pizza3 = new MargheritaPizza();
        pizza3 = new ExtraCheese(pizza3);
        pizza3 = new Jalapeno(pizza3);
        pizza3 = new Mushroom(pizza3);

        System.out.println("Pizza:- " + pizza3.getDescription());
        System.out.println("Total Cost:- " + pizza3.getPrice());
        System.out.println();


    }
}
