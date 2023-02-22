package com.ar.globallogic.VehicleDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ar.globallogic.VehicleDemo.model.Vehicle;
import com.ar.globallogic.VehicleDemo.service.impl.VehicleServiceImpl;

@RestController
public class VehicleController {
    @Autowired
    VehicleServiceImpl vehicleService;
    
    //READ - GET
    @RequestMapping(value={"/vehicles"}, method = RequestMethod.GET)
    public ResponseEntity<Object> getSales(){
        return new ResponseEntity<>(vehicleService.getVehicles(), HttpStatus.OK);
    }
    
    //CREATE - POST
    @RequestMapping(value = {"/vehicles"}, method = RequestMethod.POST)
    public ResponseEntity<Object> createVehicle(@RequestBody Vehicle sale){
        vehicleService.createVehicle(sale);
        return new ResponseEntity<>("Product was created successfully", HttpStatus.CREATED);
    }
    //UPDATE - PUT  
    @RequestMapping(value = {"/vehicles/{id}"}, method = RequestMethod.PUT)
    public ResponseEntity<Object> updateVehicle(@PathVariable("id") Long id,@RequestBody Vehicle sale){
        vehicleService.updateVehicle(id,sale);
        return new ResponseEntity<>("Sale was updated successfully", HttpStatus.OK);
    }
    //DELETE - DELETE
    @RequestMapping(value = {"/vehicles/{id}"}, method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteVehicle(@PathVariable("id") Long id){
        vehicleService.deleteVehicle(id);
        return new ResponseEntity<>("Sale deleted correctly", HttpStatus.OK);
    }
   

}
