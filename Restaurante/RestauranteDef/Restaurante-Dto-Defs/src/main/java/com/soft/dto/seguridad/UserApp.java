package com.soft.dto.seguridad;

import java.io.Serializable;

/**
 * DTO para almacenar la información del usuario en sesion.
 *
 * Created by pbastidas on 15/04/15.
 */
public class UserApp implements Serializable {

    // TODO: Crear atributos y constructores segun los requerimientos del proyecto

    private Long id;

    //<editor-fold desc="GETTERS & SETTERS">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //</editor-fold>

    public UserApp() {
	super();
    }

    public UserApp(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        // TODO: Ajustar sobreescritura para que el nombre del usuario se visualice correctamente
        return "Nombre del usuario";
    }
}
