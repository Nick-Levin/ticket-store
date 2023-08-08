package com.example.ticketstore.service;

import com.example.ticketstore.model.Ticket;

public interface TicketService {

    Ticket getTicket(String ticketId);
    Ticket createTicket(Ticket ticket);

}
