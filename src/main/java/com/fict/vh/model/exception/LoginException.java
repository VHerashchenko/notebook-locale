package com.fict.vh.model.exception;

public class LoginException extends RuntimeException {

    public LoginException (String login){
        super(login);
    }
}