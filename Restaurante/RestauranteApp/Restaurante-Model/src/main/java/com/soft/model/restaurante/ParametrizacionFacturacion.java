/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soft.model.restaurante;

import com.soft.model.Control;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jhon
 */
@Entity
@Table(name = "parametrizacion_facturacion")
@NamedQueries({
    @NamedQuery(name = "ParametrizacionFacturacion.findAll", query = "SELECT p FROM ParametrizacionFacturacion p")})
public class ParametrizacionFacturacion extends Control {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "prefijo")
    private String prefijo;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "consecutivo_inicial")
    private int consecutivoInicial;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "consecutivo_final")
    private int consecutivoFinal;
    
    @JoinColumn(name = "sede_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Sede sedeId;

    public ParametrizacionFacturacion() {
    }

    public ParametrizacionFacturacion(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public int getConsecutivoInicial() {
        return consecutivoInicial;
    }

    public void setConsecutivoInicial(int consecutivoInicial) {
        this.consecutivoInicial = consecutivoInicial;
    }

    public int getConsecutivoFinal() {
        return consecutivoFinal;
    }

    public void setConsecutivoFinal(int consecutivoFinal) {
        this.consecutivoFinal = consecutivoFinal;
    }

    public Sede getSedeId() {
        return sedeId;
    }

    public void setSedeId(Sede sedeId) {
        this.sedeId = sedeId;
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
        if (!(object instanceof ParametrizacionFacturacion)) {
            return false;
        }
        ParametrizacionFacturacion other = (ParametrizacionFacturacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soft.model.restaurante.ParametrizacionFacturacion[ id=" + id + " ]";
    }
    
}
