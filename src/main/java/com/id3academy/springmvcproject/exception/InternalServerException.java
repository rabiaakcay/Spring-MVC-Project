package com.id3academy.springmvcproject.exception;

public class InternalServerException extends RuntimeException{

    public InternalServerException(Throwable cause) {
        super(cause);
    }
}

