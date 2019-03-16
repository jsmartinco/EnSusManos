
package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.EventoRepositorio;
import com.helloworld.apispring.model.entity.Ciudadano;
import com.helloworld.apispring.model.entity.RegistroEvento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoServicio {

    
    
    @Autowired
    private EventoRepositorio eventoRepositorio;

    public EventoServicio() {
    }
    
    public List<Ciudadano> obtenerCiudadanos() {
      return eventoRepositorio.getAllCiudadanos();
              
    }
    public RegistroEvento eventoCiudadanoID(int id){
        return eventoRepositorio.eventoCiudadanoID(id);
    }
    
    
}
