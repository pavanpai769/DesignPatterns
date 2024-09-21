package factotyPattern;

public class Factory {

    private Factory() throws IllegalArgumentException{}
    public static Enemy getInstance(String enemyType){
        if(enemyType.equalsIgnoreCase("zombie")){
            return new Zombie();
        }
        if(enemyType.equalsIgnoreCase("dragon")){
            return new Dragon();
        }
        throw new IllegalArgumentException();
    }

}
