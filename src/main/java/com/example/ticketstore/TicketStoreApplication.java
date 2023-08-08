package com.example.ticketstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class TicketStoreApplication {

    public static void main(String ...args) {
        SpringApplication.run(TicketStoreApplication.class, args);
    }
}
