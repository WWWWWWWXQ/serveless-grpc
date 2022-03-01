package user;

public class UserApplication {
    public static void main(String[] args) {
        User user = new User("127.0.0.1", 8000);
        String reply = user.sayHello(" zhushiyi");
        System.out.println(reply);
    }
}
