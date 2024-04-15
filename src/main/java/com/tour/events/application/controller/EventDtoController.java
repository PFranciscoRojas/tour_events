package com.tour.events.application.controller;

import com.tour.events.domain.dto.EventDto;
import com.tour.events.domain.service.EventDtoService;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/events")
public class EventDtoController {
    @Autowired
    private EventDtoService eventDtoService;

    @GetMapping("/start")
    public String saludar(){
        return "Hola";
    }

    @GetMapping()
    public List<EventDto> getAll(){
        return eventDtoService.getAll();
    }

    @GetMapping("{id}")
    public Optional<EventDto> getByID(@PathVariable("id") int eventDtoID){
        return eventDtoService.getByID(eventDtoID);
    }

    @PostMapping()
    public EventDto save(@RequestBody EventDto eventDto){
        return eventDtoService.save(eventDto);
    }
}
