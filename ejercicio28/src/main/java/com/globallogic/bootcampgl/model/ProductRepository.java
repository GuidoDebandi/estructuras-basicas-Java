package com.globallogic.bootcampgl.model;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    static HashMap<String,Product> productData;
    
    
    public Product getById(String id) {
        return productData.get(id);
    }
}
