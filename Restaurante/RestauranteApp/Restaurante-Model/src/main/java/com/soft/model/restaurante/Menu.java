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
@Table(name = "menu")
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m")})
public class Menu extends Descriptivo {
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "menuId", fetch = FetchType.LAZY)
    private List<MenuProducto> menuProductoList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "menuId", fetch = FetchType.LAZY)
    private List<MenuCombo> menuComboList;

    public Menu() {
    }

    public List<MenuProducto> getMenuProductoList() {
        return menuProductoList;
    }

    public void setMenuProductoList(List<MenuProducto> menuProductoList) {
        this.menuProductoList = menuProductoList;
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
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soft.model.restaurante.Menu[ id=" + getId() + " ]";
    }
    
}
