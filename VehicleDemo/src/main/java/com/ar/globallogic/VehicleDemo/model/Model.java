package com.ar.globallogic.VehicleDemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MODELOS")
public class Model {
    @Id
    @Column(name="id_Modelo")
    private long id;
    @Column(name="codigo")
    private Integer code;
    @Column(name="marca")
    private String brand;
    @Column(name="nombre")
    private String name;
    
    
    public Model() {
        super();
    }


    public Model(Integer code, String brand, String name) {
        super();
        this.code = code;
        this.brand = brand;
        this.name = name;
    }


    public Integer getCode() {
        return code;
    }


    public void setCode(Integer code) {
        this.code = code;
    }


    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Model [code=" + code + ", brand=" + brand + ", name=" + name + "]";
    }
    
    
    
}
