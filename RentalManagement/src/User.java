public class User {
    private String username;
    private String password;
    private String email;
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static User createUser(String username, String password, String email) {
        return new User(username, password, email);
    }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
    }

    @Override
    public String toString() {
        return "User{" +
               "username='" + username + '\'' +
               ", email='" + email + '\'' +
               '}';
    }
}
