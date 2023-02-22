package com.ar.globallogic.CarreraDemo.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ar.globallogic.CarreraDemo.model.Carrera;
import com.ar.globallogic.CarreraDemo.repository.CarreraRepository;
import com.ar.globallogic.CarreraDemo.service.CarreraService;

@Service
public class CarreraServiceImpl implements CarreraService {
    
    @Autowired
    CarreraRepository carreraRepository;

    @Override
    public Collection<Carrera> getCarreras() {
         return carreraRepository.findAll();
    }

    @Override
    public void createCarrera(Carrera carrera) {
        carreraRepository.save(carrera);
        
    }

    @Override
    public void updateCarrera(Carrera carrera) {
        carreraRepository.save(carrera);
        
    }

    @Override
    public void deleteCarrera(Long id) {
        carreraRepository.deleteById(id);
        
    }

}
