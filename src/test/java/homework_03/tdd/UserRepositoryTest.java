package homework_03.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    private UserRepository repository;

    @BeforeEach
    void setUp() {
        repository = new UserRepository();
    }

    @AfterEach
    void tearDown() {
        repository = null;
    }

    @Test
    void logOutNotAdminsTest() {
        User userOne = new User("Vasia", "123");
        User userTwo = new User("Petya", "qwe");
        User adminOne = new Admin("Hacker3000", "iVvh#()hpz__#96G");
        User adminTwo = new Admin("CoolCracker", "^hSTNvvv#482343Zx!");

        repository.addUser(userOne);
        repository.addUser(userTwo);
        repository.addUser(adminOne);
        repository.addUser(adminTwo);

        repository.logOutNotAdmins();

        repository.getAuthorizedUsers().forEach(user -> assertTrue(user instanceof Admin));
    }
}