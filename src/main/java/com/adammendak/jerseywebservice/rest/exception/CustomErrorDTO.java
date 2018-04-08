package com.adammendak.jerseywebservice.rest.exception;

public class CustomErrorDTO extends Exception {

    private int status;
    private String message;

    public CustomErrorDTO(ErrorMessages errorMessages) {
        this.message = errorMessages.getErrorMessage();
        this.status = errorMessages.getStatus();
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
}
