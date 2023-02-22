package com.ar.globallogic.CarreraDemo.service;

import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import com.ar.globallogic.CarreraDemo.model.Carrera;
import com.ar.globallogic.CarreraDemo.repository.CarreraRepository;
import com.ar.globallogic.CarreraDemo.service.impl.CarreraServiceImpl;

@SpringBootTest
public class CarreraServiceTest {
    @Mock
    CarreraRepository repositoryMock;
    @InjectMocks
    CarreraServiceImpl carreraService= new CarreraServiceImpl();
    Carrera carrera1;
    
    @BeforeEach
    public void setup() {
        carrera1=new Carrera();
        
    }

    @Test
    public void createTest() {
        carreraService.createCarrera(carrera1);
        verify(repositoryMock).save(carrera1);
    }
    @Test
    public void updateTest() {
        carreraService.updateCarrera(carrera1);
        verify(repositoryMock).save(carrera1);
    }
    @Test
    public void getTest() {
        carreraService.getCarreras();
        verify(repositoryMock).findAll();
    }
    @Test
    public void deleteTest() {
        carreraService.deleteCarrera(carrera1.getId());
        verify(repositoryMock).deleteById(carrera1.getId());
    }
}
