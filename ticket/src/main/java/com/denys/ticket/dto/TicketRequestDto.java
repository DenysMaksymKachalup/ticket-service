package com.denys.ticket.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TicketRequestDto(
        @NotNull LocalDateTime eventDateTime,
        @NotNull @Length(min = 3) String location,
        @NotNull @Min(1) BigDecimal price) {
}
