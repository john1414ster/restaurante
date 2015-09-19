package com.soft.util.exception;

import com.soft.util.exception.enums.CodigoMensajeErrorEnum;

/**
 *
 * @author jhon
 */
public class SoftBusinessException extends Exception {

    public SoftBusinessException() {
        super();
    }

    public SoftBusinessException(String message) {
        super(message);
    }

    public SoftBusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public SoftBusinessException(Throwable cause) {
        super(cause);
    }

    public SoftBusinessException(CodigoMensajeErrorEnum codigoMensajeErrorEnum, Throwable e) {
        super(codigoMensajeErrorEnum.name(), e);
    }


}
