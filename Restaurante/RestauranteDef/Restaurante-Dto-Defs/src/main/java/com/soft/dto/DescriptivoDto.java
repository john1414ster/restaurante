/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soft.dto;

import java.io.Serializable;

/**
 *
 * @author jhon
 */
public class DescriptivoDto implements Serializable {
    
    private Integer id;
    
    private String nombre;
    
    private String descripcion;

    public DescriptivoDto(Integer id) {
        this.id = id;
    }
    
    public DescriptivoDto(Integer id, String nombre, String descripcion) {
        this(id);
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
