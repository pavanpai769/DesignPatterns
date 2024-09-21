package factotyPattern;

import java.util.ArrayList;
import java.util.List;

public class FactoryMain {
    public static void main(String[] args) {
        List<Enemy> enemies = new ArrayList<>();
        enemies.add(Factory.getInstance("zombie"));
        enemies.add(Factory.getInstance("dragon"));
        enemies.add(Factory.getInstance("hog riders"));
        enemies.add(Factory.getInstance("ZOMBIE"));
        for(Enemy enemy:enemies){
            try {
                enemy.attack();
            }catch (Exception e){
                System.out.println("Unknown type enemy is attacking");
            }
        }

    }
}
