package com.soft.wap.controller.facade;

import com.soft.definitions.view.MaestrosViewLocal;
import com.soft.dto.maestros.CategoriaProductoDto;
import com.soft.dto.maestros.TipoMedidaDto;
import com.soft.util.exception.SoftBusinessException;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/** 
 * Facade que expone las funcionalides de parametrizacion del modulo.
 * @author jhon
 */
public class MaestrosFacade implements Serializable {
    
    @EJB(beanName = "MaestrosViewBoundary")
    private MaestrosViewLocal maestrosViewLocal;
    
    public List<CategoriaProductoDto> listarCategoriasProducto() throws SoftBusinessException {
        return this.maestrosViewLocal.listarCategoriasProducto();
    }
    
    public List<TipoMedidaDto> listarTipoMedida() throws SoftBusinessException {
        return this.maestrosViewLocal.listarTipoMedida();
    }
    
}
