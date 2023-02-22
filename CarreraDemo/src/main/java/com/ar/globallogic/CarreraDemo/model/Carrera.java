package com.ar.globallogic.CarreraDemo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "CARRERAS")
public class Carrera {
    @Id
    @Column(name = "carrera_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fecha")
    private String fecha;
    @NotBlank
    @Column(name = "nombre")
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "carrera_Id")
    private List<Competidor> competidores;

    @Override
    public String toString() {
        return "Carrera [id=" + id + "fecha=" + fecha + ", nombre=" + nombre + ", competidores="
                + imprimirCompetidores() + "]";
    }

    public Carrera() {
        super();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public List<Competidor> getCompetidores() {
        return competidores;
    }

    public void setCompetidores(List<Competidor> competidores) {
        this.competidores = competidores;
    }

    public Carrera(String fecha, String nombre, List<Competidor> competidores) {
        super();
        this.fecha = fecha;
        this.nombre = nombre;
        this.competidores = competidores;
    }
    

    public Carrera(String fecha, @NotBlank String nombre) {
        super();
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public String imprimirCompetidores() {
        String stringCompetidores = "";
        for (Competidor comp : this.competidores) {
            stringCompetidores += comp.toString();
        }
        return stringCompetidores;
    }

}
