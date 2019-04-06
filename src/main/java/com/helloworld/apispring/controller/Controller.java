/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.controller;


import com.helloworld.apispring.model.entity.Ciudadano;
import com.helloworld.apispring.model.entity.RegistroEvento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class Controller {

    @Autowired
    private EventoServicio eventoServicio;
    
    @Autowired
    private CiudadanoServicio ciudadanoServicio;
    
   

    @RequestMapping(value="/ciudadanos",method = RequestMethod.GET)
    public ResponseEntity<List<Ciudadano>>obtenerCiudadanos(){
        List<Ciudadano> persona = eventoServicio.obtenerCiudadanos();
        return new ResponseEntity<List<Ciudadano>>(persona,HttpStatus.OK);
    }
    @RequestMapping(value="/ciudadanos/{id}", method = RequestMethod.GET)
    public ResponseEntity<Ciudadano> obtenerCiudadanoID(@PathVariable("id")int id){
        Ciudadano identi = ciudadanoServicio.obtenerCiudadanoID(id);
        return new ResponseEntity<Ciudadano>(identi,HttpStatus.OK);
    }
    @RequestMapping(value="/ciudadanos/desc",method = RequestMethod.GET)
    public ResponseEntity<List<Ciudadano>>ordenarCiudadanoID(){
        List<Ciudadano>orden = ciudadanoServicio.ordenarCiudadano();
        return new ResponseEntity<List<Ciudadano>>(orden,HttpStatus.OK);
    }
    
    @RequestMapping(value="/ciudadanos/evento/{id}",method = RequestMethod.GET)
    public ResponseEntity<List<RegistroEvento>>EventoCiudadanoID(@PathVariable("id")int id){
        List<RegistroEvento> evento = eventoServicio.eventoCiudadanoID(id);
        return new ResponseEntity<List<RegistroEvento>>(evento,HttpStatus.OK);
        
    }
    @RequestMapping(value="/ciudadanos/login",method = RequestMethod.GET)
    public ResponseEntity<Ciudadano> login(){
        Ciudadano inicio = ciudadanoServicio.login();
        return new ResponseEntity<Ciudadano>(inicio,HttpStatus.OK);
    }
    
    
}
