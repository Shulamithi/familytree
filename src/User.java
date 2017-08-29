public class User {

    private String username;
    private String password;
    private String emailaddress;
    private String role;

    public User(String username, String password, String emailaddress) {
        this.username = username;
        this.password = password;
        this.emailaddress = emailaddress;
        this.role = role;
    }

    //Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public String getRole() {
        return role;
    }

    //Methods
}


