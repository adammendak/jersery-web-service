package com.adammendak.jerseywebservice.rest.exception;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomExceptionDTO extends Exception {

    private int status;
    private String message;

    public CustomExceptionDTO(ExceptionMessages exceptionMessages) {
        this.message = exceptionMessages.getErrorMessage();
        this.status = exceptionMessages.getStatus();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "{ \n " +
                "\"exception\" : { \n" +
                "    \"status\" : \"" + status + "\", \n" +
                "    \"message\" : \"" + message + "\" \n" +
                "    } \n" +
                "}";
    }
}
