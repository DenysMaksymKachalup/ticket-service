package com.denys.ticket.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TicketResponseDto (
        Long id,
        Long userId,
        LocalDateTime eventDateTime,
        String location,
        BigDecimal price) {
}
