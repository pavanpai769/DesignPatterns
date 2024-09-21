package factotyPattern;

import java.util.ArrayList;
import java.util.List;

public class FactoryMain {
    public static void main(String[] args) throws IllegalArgumentException{
        List<Enemy> enemies = new ArrayList<>();
        enemies.add(Factory.getInstance("zombie"));
        enemies.add(Factory.getInstance("dragon"));
        enemies.add(Factory.getInstance("ZOMBIE"));
        for(Enemy enemy:enemies){
            enemy.attack();

        }

    }
}
