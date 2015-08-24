package com.soft.definitions.factory;

import com.soft.definitions.view.BeanViewRemote;
import com.conexia.servicefactory.CnxService;
import com.conexia.servicefactory.ServicesProvider;
import com.conexia.servicefactory.dto.ServiceDescriptorDTO;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

/**
 * Created by pbastidas on 8/04/15.
 */
public class ServicesFactory {

    // TODO: Services provider
    
    @Inject
    private ServicesProvider servicesProvider;
    

    private ServiceDescriptorDTO buildServicesDescriptorDTO(ServiciosEnum serviciosEnum) {
        return new ServiceDescriptorDTO(
            serviciosEnum.getLocalBusinessName(),
            serviciosEnum.getRemoteClazz(),
            serviciosEnum.getBeanName(),
            serviciosEnum.getAppName(),
            ServiciosEnum.MODULE_NAME
        );
    }

    // TODO: Generar producers para los servicios

    @Produces
    @CnxService
    public BeanViewRemote produceBean(){
        return servicesProvider.doLookup(BeanViewRemote.class, buildServicesDescriptorDTO(ServiciosEnum.VIEW_BEAN));
    }


}

