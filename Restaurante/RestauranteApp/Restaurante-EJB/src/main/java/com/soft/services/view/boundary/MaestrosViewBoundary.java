package com.soft.services.view.boundary;

import com.soft.definitions.view.MaestrosViewLocal;
import com.soft.dto.maestros.CategoriaProductoDto;
import com.soft.dto.maestros.TipoMedidaDto;
import com.soft.exceptions.SoftBusinessException;
import com.soft.utils.exceptions.SoftExceptionUtils;
import com.soft.utils.exceptions.enums.CodigoMensajeErrorEnum;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
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
    
    @Inject
    private SoftExceptionUtils exceptionUtils;
    
    @Override
    public List<CategoriaProductoDto> listarCategoriasProducto() throws SoftBusinessException {
        try {
            return em.createNamedQuery("CategoriaProducto.findAll", CategoriaProductoDto.class)
                    .getResultList();
        } catch (final PersistenceException e) {
            throw exceptionUtils.createBusinessException(CodigoMensajeErrorEnum.ERROR_LISTANDO_CATEGORIAS_PRODUCTO);
        }
    }

    @Override
    public List<TipoMedidaDto> listarTipoMedida() throws SoftBusinessException {
        try {
            return em.createNamedQuery("TipoMedida.findAll", TipoMedidaDto.class)
                    .getResultList();
        } catch (final PersistenceException e) {
            throw exceptionUtils.createBusinessException(CodigoMensajeErrorEnum.ERROR_LISTANDO_TIPO_MEDIDA);
        }
    }

    
}

