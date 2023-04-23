import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private String login = "login";
    private String email = "email";

    @Test
    public void shouldCreatUserWithArg (){
        String login = "login";
        String email = "@email.com";
        User user = new User(login, email);
        Assertions.assertTrue(login.equals(user.getLogin()) && email.equals(user.getEmail()));
    }

    @Test
    public void shouldCreateWhithoutArg() {
        User user = new User();
        Assertions.assertTrue((user.getEmail()==null && user.getLogin()==null));
    }

    @Test
    public void shouldEmailIsCorrect(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> new User("login", "email"));
    }

    @Test
    public void shouldLoginAndEmailWereDifferent (){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> new User("login", "login"));
    }



}