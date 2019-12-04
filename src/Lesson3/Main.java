package Lesson3;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Profile profile = new Profile();
        profile.user = user;
        System.out.println(profile.user.login);

    }
}
