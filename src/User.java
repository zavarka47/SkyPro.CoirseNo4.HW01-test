public class User {
    private String login;
    private String email;

    public User() {
    }

    public User(String login, String email) {
        if (!login.isEmpty() && !email.isEmpty()&&
                login!=null && email!=null &&
                !login.equals(email) &&
                email.contains(".") && email.contains("@")){
            this.email = email;
            this.login = login;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
