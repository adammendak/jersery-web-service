package com.adammendak.jerseywebservice.rest.exception;

public enum ExceptionMessages {
    MISSING_REQUIRED_FIELD("Missing Required Field.", 400),
    RECORD_ALREADY_EXIST("Record Already Exists.", 400),
    GENERIC_EXCEPTION("Generic Exception.", 400);

    private String errorMessage;
    private int status;

    ExceptionMessages(String errorMessage, int status) {
        this.errorMessage = errorMessage;
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static ExceptionMessages ErrorMessagesFactory(String errorMessage) {
        if(errorMessage == "MISSING_REQUIRED_FIELD") {
            return ExceptionMessages.MISSING_REQUIRED_FIELD;
        }
        if(errorMessage == "RECORD_ALREADY_EXIST") {
            return ExceptionMessages.RECORD_ALREADY_EXIST;
        }
        if(errorMessage == "GENERIC_EXCEPTION") {
            return ExceptionMessages.GENERIC_EXCEPTION;
        }
        return null;
    }
}
