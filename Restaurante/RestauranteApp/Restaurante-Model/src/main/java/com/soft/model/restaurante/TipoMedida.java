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
@Table(name = "tipo_medida", schema = "restaurante")
@NamedQueries({@NamedQuery(name = "TipoMedida.findAll", query = "select new com.soft.dto.maestros.TipoMedidaDto(tm.id, tm.nombre, tm.descripcion) "
        + "from TipoMedida tm where tm.deleted = false")   
}
)
public class TipoMedida extends Descriptivo {
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoMedidaId", fetch = FetchType.LAZY)
    private List<Producto> productoList;

    public TipoMedida() {
    }

    public TipoMedida(Integer id) {
        super(id);
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
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
        if (!(object instanceof TipoMedida)) {
            return false;
        }
        TipoMedida other = (TipoMedida) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soft.model.restaurante.TipoMedida[ id=" + getId() + " ]";
    }
    
}
