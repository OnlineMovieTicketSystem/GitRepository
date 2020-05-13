
package com.mtbs.exception;


public class MovieException extends RuntimeException {

    public MovieException(String msg) {
        super(msg);
        System.err.println(msg);
    }

}