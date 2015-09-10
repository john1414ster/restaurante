package com.soft.wap.controller.parametrizacion;

import com.ocpsoft.pretty.faces.annotation.URLMapping;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 * Controller que recibe las peticiones de la ventana de parametrizacion de productos.
 * @author jhon
 */
@Named
@ViewScoped
@URLMapping(id ="parametrizacion_productos", pattern = "/parametrizacion/parametrizacionProductos", viewId = "/parametrizacion/parametrizacionProductos.page")
public class ParametrizacionProductosController implements Serializable {
    
    private String mensaje = "Hola mundo";

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
}
