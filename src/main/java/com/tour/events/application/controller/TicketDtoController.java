package com.tour.events.application.controller;

import com.tour.events.domain.dto.TicketDto;
import com.tour.events.domain.service.TicketDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tickets")
public class TicketDtoController {
    @Autowired
    private TicketDtoService ticketDtoSrv;

    @GetMapping()
    public List<TicketDto> getAll(){
        return ticketDtoSrv.getAll();
    }

    @GetMapping("{id}")
    public Optional<TicketDto> getByID(@PathVariable("id") Integer ticketDtoID){
        return ticketDtoSrv.getByID(ticketDtoID);
    }

    @PostMapping()
    public TicketDto save(@RequestBody TicketDto ticketDto){
        return ticketDtoSrv.save(ticketDto);
    }
}
