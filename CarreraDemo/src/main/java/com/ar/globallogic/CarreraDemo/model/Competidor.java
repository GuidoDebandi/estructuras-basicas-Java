package com.ar.globallogic.CarreraDemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="COMPETIDORES")
public class Competidor {
    @Id
    @Column(name="competidor_Id")
    private Long id;
    @Column(name="numero")
    private Integer numero;
    @Column(name="nombre")
    private String nombre;

    public Competidor(Integer numero, String nombre) {
        super();
        this.numero = numero;
        this.nombre = nombre;
    }

    public Competidor() {
        super();
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Competidor [numero=" + numero + ", Nombre=" + nombre + "]";
    }

}
