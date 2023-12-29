package UserToJson;

public class Main {
    public static void main(String[] args) {
        User user = new User("Aleksey", "Bielov");
        JsonUser ju = new JsonUser(user);
        System.out.println(ju.getJsonUser());
    }
}
