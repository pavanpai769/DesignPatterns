package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private String weather;
    private List<IUser> userList = new ArrayList<>();

    public void addUser(IUser user){
        userList.add(user);
    }

    public void removeUser(IUser user){
        userList.removeIf(userInList -> userInList==user);
    }

    public void setWeather(String weather){
        this.weather=weather;
        update();
    }

    public void update(){
        for(IUser user:userList){
            user.update(this.weather);
        }
    }
}
