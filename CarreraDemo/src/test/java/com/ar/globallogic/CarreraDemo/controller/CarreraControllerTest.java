package com.ar.globallogic.CarreraDemo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ar.globallogic.CarreraDemo.model.Carrera;
import com.ar.globallogic.CarreraDemo.model.Competidor;
import com.ar.globallogic.CarreraDemo.service.impl.CarreraServiceImpl;

@SpringBootTest
public class CarreraControllerTest {
    @Mock
    CarreraServiceImpl carreraServiceMock;
    
    @InjectMocks
    CarreraController carreraController=new CarreraController();
    
    
    Carrera carrera1;
    
    @BeforeEach
    public void setup() {
        List<Competidor> competidores=new ArrayList<Competidor>();
        carrera1=new Carrera("","",competidores);
    }
    
    @Test
    public void getCarrerasTest() {
        carreraController.getCarreras();
        verify(carreraServiceMock).getCarreras();
    }
    @Test
    public void createCarrera() {
        carreraController.createCarrera(carrera1);
        verify(carreraServiceMock).createCarrera(carrera1); 
    }
    @Test
    public void updateCarrera() {
        carreraController.updateCarrera(carrera1);
        verify(carreraServiceMock).updateCarrera(carrera1); 
    }
    @Test
    public void deleteCarrera() {
        carreraController.deleteCarrera(carrera1.getId());
        verify(carreraServiceMock).deleteCarrera(carrera1.getId()); 
    }
}
