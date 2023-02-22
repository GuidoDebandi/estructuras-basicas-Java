package com.globallogic.bootcamp.hibernate.example.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.globallogic.bootcamp.hibernate.example.entity.Alumno;

public class AlumnoDaoTest {
@Test
void createTest() {
    Alumno alu1=new Alumno(0, "Jose","Perez");
    Alumno alu2=new Alumno(1, "Esteban","Quito");
    Alumno alu3=new Alumno(2, "Ulrica","Godofreda");
    
    
    AlumnoDao alumnoDao = new AlumnoDao();
    alumnoDao.createAlumno(alu1);
    alumnoDao.createAlumno(alu2);
    alumnoDao.createAlumno(alu3);

    List <Alumno> alumnos = alumnoDao.getAlumnos();
    assertEquals(alumnos.get(1).toString(), alu2.toString());
}
}
