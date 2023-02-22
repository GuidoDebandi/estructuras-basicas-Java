package com.globallogic.bootcampgl.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;


@Component
public class Order implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String product;
    private Integer count;
    private Integer costumer;
    
    public Order() {
        super();
    }
    
    @Override
    public String toString() {
        return "Order [products=" + product + ", counts=" + count + ", costumers=" + costumer + "]";
    }
    
    public Order(String product, Integer count, Integer costumer) {
        super();
        this.product = product;
        this.count = count;
        this.costumer = costumer;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    public Integer getCostumer() {
        return costumer;
    }
    public void setCostumer(Integer costumer) {
        this.costumer = costumer;
    }
    
    
}
