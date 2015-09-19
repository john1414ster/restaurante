/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soft.model.restaurante;

import com.soft.model.Descriptivo;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jhon
 */
@Entity
@Table(name = "producto", schema = "restaurante")
public class Producto extends Descriptivo {
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio_unitario")
    private double precioUnitario;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoId", fetch = FetchType.LAZY)
    private List<MenuProducto> menuProductoList;
    
    @JoinColumn(name = "categoria_producto_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CategoriaProducto categoriaProductoId;
    
    @JoinColumn(name = "tipo_medida_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TipoMedida tipoMedidaId;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoId", fetch = FetchType.LAZY)
    private List<ComboProducto> comboProductoList;

    public Producto() {
    }

    public Producto(Integer id) {
        super(id);
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public List<MenuProducto> getMenuProductoList() {
        return menuProductoList;
    }

    public void setMenuProductoList(List<MenuProducto> menuProductoList) {
        this.menuProductoList = menuProductoList;
    }

    public CategoriaProducto getCategoriaProductoId() {
        return categoriaProductoId;
    }

    public void setCategoriaProductoId(CategoriaProducto categoriaProductoId) {
        this.categoriaProductoId = categoriaProductoId;
    }

    public TipoMedida getTipoMedidaId() {
        return tipoMedidaId;
    }

    public void setTipoMedidaId(TipoMedida tipoMedidaId) {
        this.tipoMedidaId = tipoMedidaId;
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
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soft.model.restaurante.Producto[ id=" + getId() + " ]";
    }
    
}
