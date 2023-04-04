package model.user;

public abstract class User {
    private final String userName;
    private String email;
    private String phoneNumber;
    private  String password;

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
    public void setEmail(String email1){
        email= email1;
    }
    public void setPhoneNumber(String phoneNumber1){
        phoneNumber=phoneNumber1;
    }
    public void setPassword(String password1){
        password = password1;
    }
    public String toString(){
        return "email : " + email + " user name : " + userName + " phone number : " + phoneNumber + " password : " + password;
    }
}

