package com.example.test_task.web.dto;

import jakarta.validation.constraints.Pattern;

public class StringRequest {

    @Pattern(regexp = "^[a-z]+$",
            message = "String must consist of lower case letters!")
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

}
