/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soft.dto.maestros;

import com.soft.dto.DescriptivoDto;

/**
 *
 * @author jhon
 */
public class CategoriaProductoDto extends DescriptivoDto {

    public CategoriaProductoDto(Integer id) {
        super(id);
    }
    
    public CategoriaProductoDto(Integer id, String nombre, String descripcion) {
        super(id, nombre, descripcion);
    }
    
}
