package com.denys.ticket.service.impl;

import com.denys.ticket.dto.TicketRequestDto;
import com.denys.ticket.dto.TicketResponseDto;
import com.denys.ticket.repository.TicketRepository;
import com.denys.ticket.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;

    @Override
    public TicketResponseDto save(TicketRequestDto ticketRequestDto) {
        return null;
    }

    @Override
    public TicketResponseDto findById(Long ticketId) {
        return null;
    }

    @Override
    public List<TicketResponseDto> findAll() {
        return List.of();
    }

    @Override
    public TicketResponseDto updateById(Long ticketId, TicketRequestDto ticketRequestDto) {
        return null;
    }

    @Override
    public void deleteById(Long ticketId) {

    }
}
