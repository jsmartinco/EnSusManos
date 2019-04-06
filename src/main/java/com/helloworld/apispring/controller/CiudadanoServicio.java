
package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.CiudadanoRepositorio;
import com.helloworld.apispring.model.entity.Ciudadano;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadanoServicio {
    
    @Autowired
    private CiudadanoRepositorio ciudadanoRepositorio;
    private Ciudadano ciudadano;

    public CiudadanoServicio() {
    }
    
    public Ciudadano obtenerCiudadanoID(int id){
        return ciudadanoRepositorio.obtenerCiudadanoID(id);
    }
    public List<Ciudadano>ordenarCiudadano(){
        return ciudadanoRepositorio.ordenarCiudadano();
    }
    
    public Ciudadano login(){
        return ciudadanoRepositorio.login(ciudadano);
    }
    
}
