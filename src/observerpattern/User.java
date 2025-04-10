package observerpattern;
public class User implements IUser {

    String userName;
    String userId;

    public User(String userName,String userId){
        this.userName=userName;
        this.userId=userId;
    }
    @Override
    public void update(String weather){
        System.out.println("Dear "+userName+",🌤️ Weather Update! 🌧️:");
        System.out.println(weather);
    }
}
