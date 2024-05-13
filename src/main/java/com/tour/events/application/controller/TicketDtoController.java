package com.tour.events.application.controller;

import com.tour.events.domain.dto.TicketDto;
import com.tour.events.domain.service.TicketDtoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tickets")
public class TicketDtoController {
    private final TicketDtoService ticketDtoService;

    public TicketDtoController(TicketDtoService ticketDtoService) {
        this.ticketDtoService = ticketDtoService;
    }

    @GetMapping
    public List<TicketDto> getAll() {
        return ticketDtoService.getAll();
    }

    @GetMapping("/{id}")
    public TicketDto getById(@PathVariable("id") Integer id) {
        return ticketDtoService.getByID(id)
                .orElseThrow(() -> new RuntimeException("Ticket not found with ID: " + id));
    }

    @PostMapping
    public TicketDto save(@RequestBody TicketDto ticketDto) {
        return ticketDtoService.save(ticketDto);
    }
}
