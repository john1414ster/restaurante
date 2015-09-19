package com.soft.util.exception;

/**
 *
 * @author jhon
 */
public class SoftSystemException extends Exception {

    public SoftSystemException() {
        super();
    }

    public SoftSystemException(String message) {
        super(message);
    }

    public SoftSystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public SoftSystemException(Throwable cause) {
        super(cause);
    }

}
