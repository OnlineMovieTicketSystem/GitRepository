package com.mtbs.exception;


public class ShowException extends RuntimeException {

    public ShowException(String msg) {
        super(msg);
        System.err.println(msg);
    }

}

