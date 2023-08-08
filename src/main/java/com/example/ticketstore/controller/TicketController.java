package com.example.ticketstore.controller;

import com.example.ticketstore.model.Ticket;
import com.example.ticketstore.service.TicketService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/tickets")
public class TicketController {

    private final TicketService ticketService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{ticketId}")
    public Ticket getTicket(
            @PathVariable String ticketId
    ) {
        return ticketService.getTicket(ticketId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Ticket createTicket(
            @RequestBody Ticket ticket
    ) {
        return ticketService.createTicket(ticket);
    }

}
