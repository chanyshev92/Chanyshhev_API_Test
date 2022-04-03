package ru.reqresin.data.login;

public class LoginUnSuccess {

private String error;

/**
* No args constructor for use in serialization
*
*/
public LoginUnSuccess() {
}

/**
*
* @param error
*/
public LoginUnSuccess(String error) {
super();
this.error = error;
}

public String getError() {
return error;
}

public void setError(String error) {
this.error = error;
}

}