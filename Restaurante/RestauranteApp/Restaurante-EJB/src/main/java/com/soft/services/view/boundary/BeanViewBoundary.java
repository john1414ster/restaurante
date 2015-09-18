package com.soft.services.view.boundary;

import com.soft.definitions.view.BeanViewLocal;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 *
 * @author jalvarado
 */
@Stateless
@LocalBean
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class BeanViewBoundary implements BeanViewLocal {

    
}

