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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jhon
 */
@Entity
@Table(name = "combo", schema = "restaurante")
public class Combo extends Descriptivo {
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio_unitario")
    private double precioUnitario;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comboId", fetch = FetchType.LAZY)
    private List<MenuCombo> menuComboList;

    public Combo() {
        
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public List<MenuCombo> getMenuComboList() {
        return menuComboList;
    }

    public void setMenuComboList(List<MenuCombo> menuComboList) {
        this.menuComboList = menuComboList;
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
        if (!(object instanceof Combo)) {
            return false;
        }
        Combo other = (Combo) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soft.model.restaurante.Combo[ id=" + getId() + " ]";
    }
    
}
