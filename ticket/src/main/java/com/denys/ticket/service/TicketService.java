package com.denys.ticket.service;

import com.denys.ticket.dto.TicketRequestDto;
import com.denys.ticket.dto.TicketResponseDto;
import java.util.List;

public interface TicketService {
    TicketResponseDto save(TicketRequestDto ticketRequestDto);

    TicketResponseDto findById(Long ticketId);

    List<TicketResponseDto> findAll();

    TicketResponseDto updateById(Long ticketId, TicketRequestDto ticketRequestDto);

    void deleteById(Long ticketId);
}
