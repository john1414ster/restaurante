package com.soft.services.view.boundary;

import com.soft.definitions.view.MaestrosViewLocal;
import com.soft.dto.maestros.CategoriaProductoDto;
import com.soft.dto.maestros.TipoMedidaDto;
import com.soft.util.exception.SoftBusinessException;
import com.soft.util.exception.enums.CodigoMensajeErrorEnum;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

/**
 *
 * @author jalvarado
 */
@Stateless
@Local(MaestrosViewLocal.class)
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class MaestrosViewBoundary implements MaestrosViewLocal {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public List<CategoriaProductoDto> listarCategoriasProducto() throws SoftBusinessException {
        try {
            return em.createNamedQuery("CategoriaProducto.findAll", CategoriaProductoDto.class)
                    .getResultList();
        } catch (final PersistenceException e) {
            throw new SoftBusinessException(CodigoMensajeErrorEnum.ERROR_LISTANDO_CATEGORIAS_PRODUCTO, e);
        }
    }

    @Override
    public List<TipoMedidaDto> listarTipoMedida() throws SoftBusinessException {
        try {
            return em.createNamedQuery("TipoMedida.findAll", TipoMedidaDto.class)
                    .getResultList();
        } catch (final PersistenceException e) {
            throw new SoftBusinessException(CodigoMensajeErrorEnum.ERROR_LISTANDO_TIPO_MEDIDA, e);
        }
    }

    
}

