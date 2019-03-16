
package com.helloworld.apispring.model.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="registro_evento")
public class RegistroEvento {

    public RegistroEvento() {
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column
    private int id_registro;
    
    @Column 
    private Date fecha;
    
    @Column
    private String barrio;
    
    @ManyToOne
    @JoinColumn(name="ciudadano_id_ciudano")
    private Ciudadano ciudadano;
    
    @ManyToOne
    @JoinColumn(name="situaciones_id_situaciones")
    private Situaciones situacion;
    

    public int getId_registro() {
        return id_registro;
    }

    public void setId_registro(int id_registro) {
        this.id_registro = id_registro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    public Situaciones getSituacion() {
        return situacion;
    }

    public void setSituacion(Situaciones situacion) {
        this.situacion = situacion;
    }
     
            
}