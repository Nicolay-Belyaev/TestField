package homework_03.tdd;

public class Admin extends User {
    boolean isAdmin;

    public Admin(String name, String password) {
        super(name, password);
        isAdmin = true;
    }
}
