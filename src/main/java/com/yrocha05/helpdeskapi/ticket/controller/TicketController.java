package com.yrocha05.helpdeskapi.ticket.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.yrocha05.helpdeskapi.ticket.dto.CreateTicketRequest;
import com.yrocha05.helpdeskapi.ticket.dto.TicketResponse;
import com.yrocha05.helpdeskapi.ticket.model.Ticket;
import com.yrocha05.helpdeskapi.ticket.service.TicketService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TicketResponse create(@Valid @RequestBody CreateTicketRequest request) {
    Ticket ticket = ticketService.create(request);
    return TicketResponse.from(ticket);
    }
}