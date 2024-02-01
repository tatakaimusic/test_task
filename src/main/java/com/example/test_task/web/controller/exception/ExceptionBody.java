package com.example.test_task.web.controller.exception;


/**
 * Model for sending error message to UI.
 */
public class ExceptionBody {

    private String message;

    public ExceptionBody(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
