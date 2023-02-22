package com.example.demo;

import org.bson.Document;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@SpringBootApplication

public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

    public MongoClient getClient() {
        return new MongoClient("localhost", 27017);
    }

    @Override
    public void run(String... args) throws Exception {
        MongoClient mongoClient = getClient();
        MongoDatabase database = mongoClient.getDatabase("test");
        MongoCollection<Document> productsCollection = database.getCollection("products");

        Document prod1 = new Document();
        prod1.append("description", "datos ingresados por la aplicacion");
        prod1.append("name", "chocolate");
        prod1.append("stock", 15);
        prod1.append("unitPrice", 25.5);

        productsCollection.insertOne(prod1);
    }
}
