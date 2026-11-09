package com.yrocha05.helpdeskapi.ticket.dto;

import com.yrocha05.helpdeskapi.ticket.model.enums.TicketPriority;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CreateTicketRequest(
    @NotBlank
    @Size(max = 120)
    String title,

    @NotBlank
    @Size(max = 5000)
    String description,

    @NotBlank
    @Size(max = 100)
    String requesterName,

    @NotBlank
    @Email
    @Size(max = 254)
    String requesterEmail,

    @NotNull
    TicketPriority priority
) {
}
