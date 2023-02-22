package com.ar.globallogic.CarreraDemo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ar.globallogic.CarreraDemo.model.Carrera;
import com.ar.globallogic.CarreraDemo.service.impl.CarreraServiceImpl;


@RestController
public class CarreraController {
    @Autowired
    CarreraServiceImpl carreraService;
    
    //READ - GET
    @RequestMapping(value={"/carreras"}, method = RequestMethod.GET)
    public ResponseEntity<Object> getCarreras(){
        return new ResponseEntity<>(carreraService.getCarreras(), HttpStatus.OK);
    }
    
    //CREATE - POST
    @RequestMapping(value = {"/carreras"}, method = RequestMethod.POST)
    public ResponseEntity<Object> createCarrera(@Valid @RequestBody Carrera carrera){
        carreraService.createCarrera(carrera);
        return new ResponseEntity<>("carrera was created successfully", HttpStatus.CREATED);
    }
    //UPDATE - PUT  
    @RequestMapping(value = {"/carreras"}, method = RequestMethod.PUT)
    public ResponseEntity<Object> updateCarrera(@Valid @RequestBody Carrera carrera){
        carreraService.updateCarrera(carrera);
        return new ResponseEntity<>("carrera was updated successfully", HttpStatus.OK);
    }
    //DELETE - DELETE
    @RequestMapping(value = {"/carreras/{id}"}, method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteCarrera(@Valid @PathVariable("id") Long id){
        carreraService.deleteCarrera(id);
        return new ResponseEntity<>("carrera deleted correctly", HttpStatus.OK);
    }
   

}
