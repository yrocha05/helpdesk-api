package com.yrocha05.helpdeskapi.ticket.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yrocha05.helpdeskapi.common.exception.TicketNotFoundException;
import com.yrocha05.helpdeskapi.ticket.dto.CreateTicketRequest;
import com.yrocha05.helpdeskapi.ticket.model.Ticket;
import com.yrocha05.helpdeskapi.ticket.repository.TicketRepository;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket create(CreateTicketRequest request) {
        Ticket ticket = new Ticket(
            request.title(),
            request.description(),
            request.requesterName(),
            request.requesterEmail(),
            request.priority()
        );

        return ticketRepository.save(ticket);
    }

    public List<Ticket> findAll() {
        return ticketRepository.findAll();
    }

    public Ticket findById(String id) {
        return ticketRepository.findById(id)
            .orElseThrow(() -> new TicketNotFoundException(id));
    }
}