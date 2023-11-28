package homework_03.tdd;

import java.util.Objects;

public class User {

    String name;
    String password;

    boolean isAuthenticate = false;

    public User(String name, String password) {
        this.name = name;
        this.password = password;

    }

    //3.6.
    public boolean authenticate(String name, String password) {
        return Objects.equals(name, this.name) &&
               Objects.equals(password, this.password);
    }

}

