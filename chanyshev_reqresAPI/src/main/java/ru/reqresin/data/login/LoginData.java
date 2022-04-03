package ru.reqresin.data.login;

public class LoginData {

private String email;
private String password;

/**
* No args constructor for use in serialization
*
*/
public LoginData() {
    super();
}

/**
*
* @param password
* @param email
*/
public LoginData(String email, String password) {
this.email = email;
this.password = password;
}

public LoginData(String email) {
    this.email = email;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getPassword() {
return password;
}

public void setPassword(String password) {
this.password = password;
}

}