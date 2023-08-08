package com.example.ticketstore.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document("tickets")
public class Ticket {

    private String departurePlace;
    private String destinationPlace;
    private Date departureTime;
    private Date arrivalTime;
    private BigDecimal price;

}
