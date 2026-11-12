package com.yrocha05.helpdeskapi.ticket.dto;

import java.time.Instant;

import com.yrocha05.helpdeskapi.ticket.model.Ticket;
import com.yrocha05.helpdeskapi.ticket.model.enums.TicketPriority;
import com.yrocha05.helpdeskapi.ticket.model.enums.TicketStatus;

public record TicketResponse(
    String id,
    String title,
    String description,
    String requesterName,
    String assignee,
    TicketPriority priority,
    TicketStatus status,
    Instant createdAt,
    Instant updatedAt,
    Instant closedAt
) 
{
    public static TicketResponse from(Ticket ticket) {
        return new TicketResponse(
            ticket.getId(),
            ticket.getTitle(),
            ticket.getDescription(),
            ticket.getRequesterName(),
            ticket.getAssignee(),
            ticket.getPriority(),
            ticket.getStatus(),
            ticket.getCreatedAt(),
            ticket.getUpdatedAt(),
            ticket.getClosedAt()
        );
    }
}