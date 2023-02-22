package com.ar.globallogic.VehicleDemo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="VEHICULOS")
public class Vehicle {
    @Id
    @Column(name="id_Vehiculo")
    private long id;
    @Column(name="codigo")
    private Integer code;
    @Column(name="identificacion")
    private String identify;
    @ManyToOne
    @JoinColumn(name="id_Tipo")
    private Type type;
    @ManyToOne
    @JoinColumn(name="id_Modelo")
    private Model model;
    @Column(name="time_Stamp")
    private Date productionDate;
    
    public Vehicle() {
        super();
    }

    public Vehicle(Integer code, String identify, Type type, Model model, Date productionDate) {
        super();
        this.code = code;
        this.identify = identify;
        this.type = type;
        this.model = model;
        this.productionDate = productionDate;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public String toString() {
        return "Vehicle [code=" + code + ", identify=" + identify + ", type=" + type.toString() + ", model=" + model.toString()
                + ", productionDate=" + productionDate + "]";
    }
    
    
    
    
}
