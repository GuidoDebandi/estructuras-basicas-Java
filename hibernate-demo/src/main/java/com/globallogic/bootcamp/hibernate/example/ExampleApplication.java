package com.globallogic.bootcamp.hibernate.example;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.globallogic.bootcamp.hibernate.example.dao.AlumnoDao;
import com.globallogic.bootcamp.hibernate.example.entity.Alumno;

public class ExampleApplication {

	private static Logger LOGGER= LoggerFactory.getLogger(ExampleApplication.class);
	
	public static void main(String[] args) {
	    long valorLong = 1L;
	    int valorInt = 1;
        AlumnoDao alumnoDao = new AlumnoDao();
        alumnoDao.createAlumno(new Alumno(0, "Jose","Perez"));
        alumnoDao.createAlumno(new Alumno(0, "Estban","Quito"));
        alumnoDao.createAlumno(new Alumno(0, "Ulrica","Godofreda"));
    
        List <Alumno> alumnos = alumnoDao.getAlumnos();     
        LOGGER.info("Todos los Alumnos: {}",alumnos);
        
        Alumno alumnoCorregido  = alumnos.get(1);
        alumnoCorregido.setNombre("Estefano");
        alumnoDao.updateAlumno(alumnoCorregido);
        LOGGER.info("Alumnos corregidos: {}",alumnoDao.getAlumnos());
        
        alumnoDao.removeAlumno(alumnoDao.getAlumnos("Jose","Perez").get(0));
        LOGGER.info("Alumnos filtrados: {}",alumnoDao.getAlumnos());
        
        LOGGER.info("\n Valor long: " + valorLong + "\n Valor int:  "+ valorInt);
    }
	
}
