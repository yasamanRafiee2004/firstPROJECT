package model.user;

public abstract class User {
    private final String userName;
    private final String email;
    private final String phoneNumber;
    private final String password;

    public User(String userName, String email, String phoneNumber, String password) {
        this.userName = userName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
    public String getUserName(){
        return userName;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
}

