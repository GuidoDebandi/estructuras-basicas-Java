package com.ar.globallogic.VehicleDemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TIPOS")
public class Type {
    @Id
    @Column(name="id_Tipo")
    private long id;
    @Column(name="codigo")
    private Integer code;
    @Column(name="categoria")
    private String category;
    @Column(name="puertas")
    private Integer doors;
    
    


    public Type() {
        super();
    }



    public Type(int code, String category, int doors) {
        super();
        this.code = code;
        this.category = category;
        this.doors = doors;
    }
    
    
    public int getCode() {
        return code;
    }



    public void setCode(int code) {
        this.code = code;
    }



    public String getCategory() {
        return category;
    }



    public void setCategory(String category) {
        this.category = category;
    }



    public int getDoors() {
        return doors;
    }



    public void setDoors(int doors) {
        this.doors = doors;
    }



    @Override
    public String toString() {
        return "Type [code=" + code + ", category=" + category + ", doors=" + doors + "]";
    }
    
    


    
}
