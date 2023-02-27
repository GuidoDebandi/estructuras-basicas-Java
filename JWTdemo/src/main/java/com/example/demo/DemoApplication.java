package com.example.demo;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.security.Security;

@SpringBootApplication
@EnableFeignClients
public class DemoApplication {

	public static void main(final String[] args) {
		// Add BouncyCastle as an algorithm provider
		//Security.addProvider(new BouncyCastleProvider());
		SpringApplication.run(DemoApplication.class, args);
	}

}
