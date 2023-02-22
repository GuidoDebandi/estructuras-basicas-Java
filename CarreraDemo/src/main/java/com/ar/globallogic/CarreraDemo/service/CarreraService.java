package com.ar.globallogic.CarreraDemo.service;

import java.util.Collection;

import com.ar.globallogic.CarreraDemo.model.Carrera;



public interface CarreraService {
    
    public abstract Collection<Carrera>getCarreras();
    public abstract void createCarrera(Carrera carrera);
    public abstract void updateCarrera(Carrera carrera);
    public abstract void deleteCarrera(Long id);

}
