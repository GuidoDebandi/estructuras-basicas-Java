package com.ar.globallogic.CarreraDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ar.globallogic.CarreraDemo.model.Carrera;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera,Long>{

}
