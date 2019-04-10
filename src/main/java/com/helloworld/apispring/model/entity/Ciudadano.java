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
@Table(name = "ciudadano")
public class Ciudadano {

    public Ciudadano() {
    }
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private int id_ciudadano;

    @Column
    private String Nombre;

    @Column
    private String Usuario;

    @Column
    private String pass;
    
    
    @Column
    private int puntaje;
    
    @OneToMany(mappedBy="ciudadano")
    private List <RegistroEvento> evento;

    
    public int getId_ciudadano() {
        return id_ciudadano;
    }

    public void setId_ciudadano(int id_ciudadano) {
        this.id_ciudadano = id_ciudadano;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

   
    public String getUsuario() {
        return Usuario;
    }

   
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getpass() {
        return pass;
    }

    public void setpass(String pass) {
        this.pass = pass;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

}

