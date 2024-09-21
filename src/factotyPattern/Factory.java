package factotyPattern;

public class Factory {

    private Factory() {}
    public static Enemy getInstance(String enemyType)throws IllegalArgumentException{
        if(enemyType.equalsIgnoreCase("zombie")){
            return new Zombie();
        }
        if(enemyType.equalsIgnoreCase("dragon")){
            return new Dragon();
        }
        throw new IllegalArgumentException("Unknown Type Enemy!");
    }

}
