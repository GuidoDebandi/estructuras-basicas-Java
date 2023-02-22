package com.globallogic.bootcampgl.model;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderFactory  {
   
    
   public static Order getNewOrder(){
       
       return new Order();
    }
    
}
