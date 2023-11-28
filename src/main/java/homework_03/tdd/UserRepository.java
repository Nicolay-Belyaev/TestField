package homework_03.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    private List<User> authorizedUsers = new ArrayList<>();

    public void addUser(User user) {
       authorizedUsers.add(user);
    }

    public boolean findByName(String username) {
        for (User user : authorizedUsers) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void logOutNotAdmins () {
        List<User> authorizedAdmins = new ArrayList<>();
        authorizedUsers.forEach(user -> {
            if (user instanceof Admin) {
                authorizedAdmins.add(user);
            }
        });
        authorizedUsers = authorizedAdmins;
    }

    public List<User> getAuthorizedUsers() {
        return authorizedUsers;
    }
}