package com.globallogic.bootcampgl.model;

import org.springframework.beans.factory.annotation.Value;

public class Costumer {
    

 private String name;

 private Long id;

 private Integer dni;
 
 
 
public Costumer( String name,  Long i, Integer dni) {
    super();
    this.name = name;
    this.id = i;
    this.dni = dni;
}
public Costumer() {
    super();
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public Integer getDni() {
    return dni;
}
public void setDni(Integer dni) {
    this.dni = dni;
}
@Override
public String toString() {
    return "Costumer [name=" + name + ", id=" + id + ", dni=" + dni + "]";
}
 
 
}
