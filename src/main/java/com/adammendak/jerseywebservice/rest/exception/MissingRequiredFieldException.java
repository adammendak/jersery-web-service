package com.adammendak.jerseywebservice.rest.exception;

public class MissingRequiredFieldException extends Exception {

    public MissingRequiredFieldException(String message) {
        super(message);
    }

}
