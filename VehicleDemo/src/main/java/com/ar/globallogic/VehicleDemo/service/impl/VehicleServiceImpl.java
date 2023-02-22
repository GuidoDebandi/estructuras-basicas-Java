package com.ar.globallogic.VehicleDemo.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ar.globallogic.VehicleDemo.model.Vehicle;
import com.ar.globallogic.VehicleDemo.repository.VehicleRepository;
import com.ar.globallogic.VehicleDemo.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {
    
    @Autowired
    VehicleRepository vehicleRepository;

    @Override
    public Collection<Vehicle> getVehicles() {
        
        return vehicleRepository.findAll();
    }

    @Override
    public void createVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
        
    }

    @Override
    public void updateVehicle(Long id, Vehicle vehicle) {
        vehicleRepository.save(vehicle);
        
    }

    @Override
    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
        
    }

}
