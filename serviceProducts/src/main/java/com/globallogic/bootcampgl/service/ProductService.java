package com.globallogic.bootcampgl.service;

import java.util.Collection;

import com.globallogic.bootcampgl.dto.ProductDTO;

/**
 * Product Service
 */
public interface ProductService {
    
    public abstract Collection<ProductDTO>getProducts();
    public abstract void createProducto(ProductDTO producto);
    public abstract void updateProducto(String id,ProductDTO producto);
    public abstract void deleteProducto(String id);

}
