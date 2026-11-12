package com.yrocha05.helpdeskapi.ticket.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yrocha05.helpdeskapi.ticket.model.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, String> {

}
