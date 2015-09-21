package com.soft.exceptions;

import javax.ejb.ApplicationException;
import java.util.Objects;

/**
 * Excepcion para el manejo de errores del sistema
 *
 */
@ApplicationException(rollback = true)
public class SoftSystemException extends RuntimeException implements SoftException {
    private Enum codigoError;
    private String[] params;

    public SoftSystemException(String codigo) {
        super(codigo);
    }

    public SoftSystemException(Enum codigo) {
        super(codigo.name());

        Objects.requireNonNull(codigo);
        this.codigoError = codigo;
    }

    public SoftSystemException(Enum codigo, String... params) {
        this(codigo);
        this.params = params;
    }

    public Enum getCodigoError() {
        return codigoError;
    }

    public String[] getParams() {
        return params;
    }
}