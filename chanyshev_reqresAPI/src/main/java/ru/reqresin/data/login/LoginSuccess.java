
package ru.reqresin.data.login;

public class LoginSuccess {

private String token;

/**
* No args constructor for use in serialization
*
*/
public LoginSuccess() {
}

/**
*
* @param token
*/
public LoginSuccess(String token) {
super();
this.token = token;
}

public String getToken() {
return token;
}

public void setToken(String token) {
this.token = token;
}

}