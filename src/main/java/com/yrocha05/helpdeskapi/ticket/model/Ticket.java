package com.yrocha05.helpdeskapi.ticket.model;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.yrocha05.helpdeskapi.ticket.model.enums.TicketPriority;
import com.yrocha05.helpdeskapi.ticket.model.enums.TicketStatus;

@Document(collection = "tickets")
public class Ticket {

    @Id // MongoDB IDENTIFIER
    private String id;

    private String protocol;
    private String title;
    private String description;
    private String requesterName;
    private String requesterEmail;
    private String assignee;
    private TicketPriority priority;
    private TicketStatus status;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant closedAt;

    public Ticket() {
    }


    public Ticket(String title, String description, String requesterName, String requesterEmail, TicketPriority priority) {
        this.title = title;
        this.description = description;
        this.requesterName = requesterName;
        this.requesterEmail = requesterEmail;
        this.priority = priority;
        this.status = TicketStatus.OPEN;
        this.createdAt = Instant.now();
        this.updatedAt = this.createdAt;
    }


    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignee() {
        return this.assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public TicketPriority getPriority() {
        return this.priority;
    }

    public void setPriority(TicketPriority priority) {
        this.priority = priority;
    }

    public TicketStatus getStatus() {
        return this.status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public Instant getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Instant getClosedAt() {
        return this.closedAt;
    }

    public void setClosedAt(Instant closedAt) {
        this.closedAt = closedAt;
    }

    public String getId() {
        return this.id;
    }

    public String getRequesterName() {
        return this.requesterName;
    }

    public String getRequesterEmail() {
        return this.requesterEmail;
    }

    public Instant getCreatedAt() {
        return this.createdAt;
    }
    

}
