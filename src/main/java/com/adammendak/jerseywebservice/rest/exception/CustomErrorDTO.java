package com.adammendak.jerseywebservice.rest.exception;

public class CustomErrorDTO extends Exception {

    private int status;

    public CustomErrorDTO(String message, int status) {
        super(message);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
