package com.globallogic.bootcampgl.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.globallogic.bootcampgl.model.Costumer;
import com.globallogic.bootcampgl.model.Order;
import com.globallogic.bootcampgl.model.OrderFactory;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

    @Autowired
    private Environment env;
    
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	

    

    @Override
    public void run(String... args) throws Exception {
        Costumer cos1 = new Costumer();
        cos1.setName(env.getProperty("in.name"));
        cos1.setId( Long.valueOf(env.getProperty("in.id")));
        cos1.setDni(Integer.valueOf(env.getProperty("in.dni")));
        System.out.println(cos1.toString());

        
    }

}
