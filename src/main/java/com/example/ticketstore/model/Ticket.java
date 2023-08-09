package com.example.ticketstore.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document("tickets")
@EqualsAndHashCode(callSuper = true)
public class Ticket extends AuditingBaseDocument {

    private String departurePlace;
    private String destinationPlace;
    private Date departureTime;
    private Date arrivalTime;
    private BigDecimal price;

}
