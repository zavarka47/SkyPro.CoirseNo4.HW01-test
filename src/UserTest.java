import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private String login = "login";
    private String email = "email";

    @Test
    public void shouldCreatUserWithArg (){
        Assertions.assertThrows(IllegalArgumentException.class, () -> new User("", ""));
    }

    @Test
    public void shouldCreateWhithoutArg() {
        User user = new User();
        Assertions.assertTrue((user.getEmail()==null && user.getLogin()==null));
    }

    @Test
    public void shouldEmailIsCorrect(){
        User user = new User(login, email);
        Assertions.assertTrue((user.getEmail().contains(".") && user.getEmail().contains("@")));
    }

    @Test
    public void shouldLoginAndEmailWereDifferent (){
        User user = new User(login, email);
        Assertions.assertFalse(email.equals(login));
    }



}