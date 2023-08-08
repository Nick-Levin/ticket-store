package com.example.ticketstore.repository;

import com.example.ticketstore.model.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String> {

}
