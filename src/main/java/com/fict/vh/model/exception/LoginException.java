package com.fict.vh.model.exception;

public class LoginException extends RuntimeException {
    private static final String defaultMessage = "Login is not unique";

    public LoginException (String login){
        super(defaultMessage + ": " + login);
    }
}
