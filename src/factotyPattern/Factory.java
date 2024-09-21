package factotyPattern;

public class Factory {

    private Factory(){}
    public static Enemy getInstance(String enemyType){
        if(enemyType.equalsIgnoreCase("zombie")){
            return new Zombie();
        }
        if(enemyType.equalsIgnoreCase("dragon")){
            return new Dragon();
        }
        return null;
    }

}
