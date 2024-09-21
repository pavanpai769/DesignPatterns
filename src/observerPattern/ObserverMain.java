package observerPattern;

public class ObserverMain {
    public static void main(String[] args) {

        IUser pavan= new User("Pavan","&Uu@76");
        IUser pradeep = new User("Pradeep","#i4H$");

        WeatherStation weatherStation = new WeatherStation();

        weatherStation.addUser(pavan);
        weatherStation.addUser(pradeep);

        weatherStation.setWeather("Raining");
        weatherStation.update();
    }
}
