
package com.helloworld.apispring.model.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="situaciones")

public class Situaciones {

    public Situaciones() {
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id_Situaciones;
    
    @Column
    private String Descripcion;
    
    @Column
    private int Puntaje_situa;
    
    @OneToMany(mappedBy="situacion")
    private List <RegistroEvento> evento;
    

    public int getId_Situaciones() {
        return id_Situaciones;
    }

    public void setId_Situaciones(int id_Situaciones) {
        this.id_Situaciones = id_Situaciones;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getPuntaje_situa() {
        return Puntaje_situa;
    }

    public void setPuntaje_situa(int Puntaje_situa) {
        this.Puntaje_situa = Puntaje_situa;
    }

    
    
    
}
