package com.ar.globallogic.VehicleDemo.service;

import java.util.Collection;

import com.ar.globallogic.VehicleDemo.model.Vehicle;



public interface VehicleService {
    
    public abstract Collection<Vehicle>getVehicles();
    public abstract void createVehicle(Vehicle vehicle);
    public abstract void updateVehicle(Long id,Vehicle vehicle);
    public abstract void deleteVehicle(Long id);

}
