package com.soft.utils.exceptions;

import com.soft.exceptions.SoftSystemException;
import com.soft.exceptions.SoftBusinessException;
import com.soft.exceptions.SoftException;
import com.soft.utils.exceptions.enums.CodigoMensajeErrorEnum;
import java.io.Serializable;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Utilidad que puede ser inyectada con CDI para utilizar
 * para crear excepciones y manejo de excepciones
 * <p/>
 * Created by pbastidas on 12/11/14.
 */
public class SoftExceptionUtils implements Serializable {

    public SoftExceptionUtils() {
    }

    public SoftBusinessException createBusinessException(CodigoMensajeErrorEnum codigo, String... params) {
        return new SoftBusinessException(codigo, params);
    }

    public SoftSystemException createSystemException(CodigoMensajeErrorEnum codigo, String... params) {
        return new SoftSystemException(codigo, params);
    }

    public SoftSystemException createSystemErrorException() {
        return new SoftSystemException(CodigoMensajeErrorEnum.SYSTEM_ERROR);
    }

    public String createSystemErrorMessage(ResourceBundle resourceBundle) {
        return resourceBundle.getString(CodigoMensajeErrorEnum.SYSTEM_ERROR.name().toLowerCase());
    }

    public String createMessage(ResourceBundle resourceBundle, SoftException conexiaException) {
        if (conexiaException.getCodigoError() instanceof CodigoMensajeErrorEnum) {
            return createMessage(resourceBundle, (CodigoMensajeErrorEnum) conexiaException.getCodigoError(), conexiaException.getParams());
        } else {
            throw new IllegalArgumentException("Excepciona a procesar debe tener codigos de tipo CodigoMensajeErrorEnum");
        }
    }

    public String createMessage(ResourceBundle resourceBundle, CodigoMensajeErrorEnum codigoError, String... params) {
        try {
            String msg = resourceBundle.getString(codigoError.name().toLowerCase());

            if (params != null) {
                msg = String.format(msg, params);
            }

            return msg;
        } catch (MissingResourceException e) {
            final String msg = resourceBundle.getString("recurso_no_encontrado");

            return String.format(msg, codigoError);
        }
    }
}
