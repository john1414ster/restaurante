/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soft.model.restaurante;

import com.soft.model.Descriptivo;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jhon
 */
@Entity
@Table(name = "categoria_producto", schema = "restaurante")
@NamedQueries({@NamedQuery(name = "CategoriaProducto.findAll", query = "select new com.soft.dto.maestros.CategoriaProductoDto(cp.id, cp.nombre, cp.descripcion) "
        + "from CategoriaProducto cp where cp.deleted = false")   
}
)
public class CategoriaProducto extends Descriptivo {
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoriaProductoId", fetch = FetchType.LAZY)
    private List<Producto> productoList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoriaProductoId", fetch = FetchType.LAZY)
    private List<ComboProducto> comboProductoList;

    public CategoriaProducto() {
        super();
    }

    public CategoriaProducto(Integer id) {
        super(id);
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    public List<ComboProducto> getComboProductoList() {
        return comboProductoList;
    }

    public void setComboProductoList(List<ComboProducto> comboProductoList) {
        this.comboProductoList = comboProductoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.getId() != null ? this.getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaProducto)) {
            return false;
        }
        CategoriaProducto other = (CategoriaProducto) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "com.soft.model.restaurante.CategoriaProducto[ id=" + this.getId() + " ]";
    }
    
}
