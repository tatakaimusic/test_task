package com.example.test_task.web.controller;

import com.example.test_task.web.controller.exception.ExceptionBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Objects;

@RestControllerAdvice
public class ControllerAdvice {

    /**
     * Handle MethodArgumentNotValidException
     *
     * @param e MethodArgumentNotValidException
     * @return ExceptionBody
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ExceptionBody handleMethodArgumentNotValid(
            MethodArgumentNotValidException e
    ) {
        return new ExceptionBody(
                Objects.requireNonNull(e.getFieldError())
                        .getDefaultMessage()
        );
    }

}
