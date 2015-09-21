package com.soft.exceptions;

import java.util.Objects;
import javax.ejb.ApplicationException;

/**
 *
 * @author jhon
 */
@ApplicationException(rollback = true)
public class SoftBusinessException extends Exception implements SoftException {

    private Enum codigoError;
    private String[] params;
    
    public SoftBusinessException(Enum codigo, String[] params) {
        super(codigo.name());
        Objects.requireNonNull(codigo);

        this.codigoError = codigo;
        this.params = params;
    }

    public Enum getCodigoError() {
        return codigoError;
    }

    public String[] getParams() {
        return params;
    }
}
