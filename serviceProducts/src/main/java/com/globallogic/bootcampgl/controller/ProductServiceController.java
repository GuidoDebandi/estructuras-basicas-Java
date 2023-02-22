package com.globallogic.bootcampgl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.bootcampgl.dto.ProductDTO;
import com.globallogic.bootcampgl.service.impl.ProductServiceImpl;

/**
 * Product Service Controller
 */
@RestController
public class ProductServiceController {
    @Autowired
    ProductServiceImpl productService;
    
    @RequestMapping(value = "/products",method=RequestMethod.GET)
    public ResponseEntity<Object> getProducts(){
        return new ResponseEntity<Object>(productService.getProducts(),HttpStatus.OK);
    }
    
    @RequestMapping(value = "/products",method=RequestMethod.POST)
    public ResponseEntity<Object> CreateProducto(@RequestBody ProductDTO productDTO){
        productService.createProducto(productDTO);
       return new ResponseEntity<Object>("Product created succesfully",HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/products/{id}",method=RequestMethod.PUT)
    public ResponseEntity<Object> updateProducto(@PathVariable("id") String id,@RequestBody ProductDTO productDTO){
        productService.updateProducto(id,productDTO);
       return new ResponseEntity<Object>("Product updated successfully",HttpStatus.OK);
    }
    
    @RequestMapping(value = "/products/{id}",method=RequestMethod.DELETE)
    public ResponseEntity<Object> deleteProducto(@PathVariable("id") String id){
        productService.deleteProducto(id);
       return new ResponseEntity<Object>("Product deleted successfully",HttpStatus.OK);
    }
    
}
