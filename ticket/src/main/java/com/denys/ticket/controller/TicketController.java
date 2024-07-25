package com.denys.ticket.controller;

import com.denys.ticket.dto.TicketRequestDto;
import com.denys.ticket.dto.TicketResponseDto;
import com.denys.ticket.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ticket")
@AllArgsConstructor
public class TicketController {
    private final TicketService ticketService;

    @PostMapping()
    public TicketResponseDto save(
            @RequestBody TicketRequestDto ticketRequestDto) {
        return ticketService.save(ticketRequestDto);
    }

    @GetMapping("/{id}")
    public TicketResponseDto findById(@PathVariable Long id) {
        return ticketService.findById(id);
    }

    @GetMapping()
    public List<TicketResponseDto> findAll() {
        return ticketService.findAll();
    }

    @PutMapping("/{id}")
    public TicketResponseDto updateById(
            @PathVariable Long id,
            @RequestBody TicketRequestDto ticketRequestDto) {
        return ticketService.updateById(id, ticketRequestDto);
    }
}
