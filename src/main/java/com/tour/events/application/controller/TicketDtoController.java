package com.tour.events.application.controller;

import com.tour.events.domain.dto.EventSaveDto;
import com.tour.events.domain.dto.TicketDto;
import com.tour.events.domain.service.EventDtoService;
import com.tour.events.domain.service.TicketDtoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/tickets")
public class TicketDtoController {
    @Autowired
    private TicketDtoService ticketDtoSrv;

    @Autowired
    private EventDtoService eventDtoService;

    @GetMapping()
    public List<TicketDto> getAll(){
        return ticketDtoSrv.getAll();
    }

    @GetMapping("{id}")
    public Optional<TicketDto> getByID(@PathVariable("id") Integer ticketDtoID){
        return ticketDtoSrv.getByID(ticketDtoID);
    }

    @PostMapping()
    public ResponseEntity<?> save(@Validated @RequestBody TicketDto ticketDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            bindingResult.getFieldErrors().forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
            return ResponseEntity.badRequest().body(errors);
        }
        return ResponseEntity.ok(ticketDtoSrv.save(ticketDto));
    }


    @PostMapping("/{id}/cancel")
    public void cancelTicket(@PathVariable("id") Integer ticketDtoID){
        ticketDtoSrv.cancelTicket(ticketDtoID);
//        EventSaveDto updatedEvent = eventDtoService.updateEvent();
    }
}
