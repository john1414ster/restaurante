/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soft.model.restaurante;

import com.soft.model.Control;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jhon
 */
@Entity
@Table(name = "mesero", schema = "restaurante")
public class Mesero extends Control {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre_apellido")
    private String nombreApellido;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "numero_documento")
    private String numeroDocumento;
    
    @Column(name = "horario_desde")
    @Temporal(TemporalType.TIME)
    private Date horarioDesde;
    
    @Column(name = "horario_hasta")
    @Temporal(TemporalType.TIME)
    private Date horarioHasta;
    
    @Size(max = 20)
    @Column(name = "dia_desde")
    private String diaDesde;
    
    @Size(max = 20)
    @Column(name = "dia_hasta")
    private String diaHasta;
    
    @JoinColumn(name = "sede_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Sede sedeId;

    public Mesero() {
    }

    public Mesero(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Date getHorarioDesde() {
        return horarioDesde;
    }

    public void setHorarioDesde(Date horarioDesde) {
        this.horarioDesde = horarioDesde;
    }

    public Date getHorarioHasta() {
        return horarioHasta;
    }

    public void setHorarioHasta(Date horarioHasta) {
        this.horarioHasta = horarioHasta;
    }

    public String getDiaDesde() {
        return diaDesde;
    }

    public void setDiaDesde(String diaDesde) {
        this.diaDesde = diaDesde;
    }

    public String getDiaHasta() {
        return diaHasta;
    }

    public void setDiaHasta(String diaHasta) {
        this.diaHasta = diaHasta;
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
        if (!(object instanceof Mesero)) {
            return false;
        }
        Mesero other = (Mesero) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soft.model.restaurante.Mesero[ id=" + id + " ]";
    }
    
}
