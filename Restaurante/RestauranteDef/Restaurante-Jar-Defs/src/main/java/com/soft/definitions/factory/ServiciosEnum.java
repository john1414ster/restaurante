package com.soft.definitions.factory;

import com.soft.definitions.view.BeanViewRemote;

/**
 * Created by pbastidas on 8/04/15.
 */
public enum ServiciosEnum {

    // TODO: crear enums con los valores correctos
    VIEW_BEAN(BeanViewRemote.class, "BeanViewBoundary");

    public static final String MODULE_NAME = "restaurante-ejb";
    // Estructura del enum
    private final String localBusinessName;
    private final Class remoteClazz;
    private final String beanName;

    ServiciosEnum(Class remoteClazz, String beanName) {
        this.localBusinessName = "";
        this.remoteClazz = remoteClazz;
        this.beanName = beanName;
    }

    public String getLocalBusinessName() {
        return localBusinessName;
    }

    public Class getRemoteClazz() {
        return remoteClazz;
    }

    public String getBeanName() {
        return beanName;
    }

    public String getAppName() {
        return "restaurante";
    }
}
