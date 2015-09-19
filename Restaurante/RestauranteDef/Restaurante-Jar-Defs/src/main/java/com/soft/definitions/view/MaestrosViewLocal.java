package com.soft.definitions.view;

import com.soft.dto.maestros.CategoriaProductoDto;
import com.soft.dto.maestros.TipoMedidaDto;
import com.soft.util.exception.SoftBusinessException;
import java.util.List;

/**
 *
 * @author jalvarado
 */
public interface MaestrosViewLocal {
    
    List<CategoriaProductoDto> listarCategoriasProducto() throws SoftBusinessException;
    
    List<TipoMedidaDto> listarTipoMedida() throws SoftBusinessException;
    
}
