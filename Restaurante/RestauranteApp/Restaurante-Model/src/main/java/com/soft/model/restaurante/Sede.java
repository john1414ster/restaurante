/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soft.model.restaurante;

import com.soft.model.Control;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jhon
 */
@Entity
@Table(name = "sede")
@NamedQueries({
    @NamedQuery(name = "Sede.findAll", query = "SELECT s FROM Sede s")})
public class Sede extends Control {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "cantidad_mesas")
    private Integer cantidadMesas;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sedeId", fetch = FetchType.LAZY)
    private List<Mesero> meseroList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sedeId", fetch = FetchType.LAZY)
    private List<Mesa> mesaList;
    
    @OneToMany(mappedBy = "sedeId", fetch = FetchType.LAZY)
    private List<Sede> sedeList;
    
    @JoinColumn(name = "sede_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Sede sedeId;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sedeId", fetch = FetchType.LAZY)
    private List<ParametrizacionFacturacion> parametrizacionFacturacionList;

    public Sede() {
    }

    public Sede(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCantidadMesas() {
        return cantidadMesas;
    }

    public void setCantidadMesas(Integer cantidadMesas) {
        this.cantidadMesas = cantidadMesas;
    }

    public List<Mesero> getMeseroList() {
        return meseroList;
    }

    public void setMeseroList(List<Mesero> meseroList) {
        this.meseroList = meseroList;
    }

    public List<Mesa> getMesaList() {
        return mesaList;
    }

    public void setMesaList(List<Mesa> mesaList) {
        this.mesaList = mesaList;
    }

    public List<Sede> getSedeList() {
        return sedeList;
    }

    public void setSedeList(List<Sede> sedeList) {
        this.sedeList = sedeList;
    }

    public Sede getSedeId() {
        return sedeId;
    }

    public void setSedeId(Sede sedeId) {
        this.sedeId = sedeId;
    }

    public List<ParametrizacionFacturacion> getParametrizacionFacturacionList() {
        return parametrizacionFacturacionList;
    }

    public void setParametrizacionFacturacionList(List<ParametrizacionFacturacion> parametrizacionFacturacionList) {
        this.parametrizacionFacturacionList = parametrizacionFacturacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sede)) {
            return false;
        }
        Sede other = (Sede) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soft.model.restaurante.Sede[ id=" + id + " ]";
    }
    
}
