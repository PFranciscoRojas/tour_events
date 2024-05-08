package com.tour.events.application.controller;

import com.tour.events.domain.dto.EventDto;
import com.tour.events.domain.dto.EventSaveDto;
import com.tour.events.domain.service.EventDtoService;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/events")
public class EventDtoController {
    @Autowired
    private EventDtoService eventDtoService;

    @GetMapping()
    public List<EventDto> getAll(){
        return eventDtoService.getAll();
    }

    @GetMapping("{id}")
    public Optional<EventDto> getByID(@PathVariable("id") int eventDtoID){
        return eventDtoService.getByID(eventDtoID);
    }

    @GetMapping("/city")
    public List<EventDto> getByCity(@RequestParam String city){
        return eventDtoService.getByCity(city);
    }

    @GetMapping("/name")
    public List<EventDto> getByNAme(@RequestParam String name){
        return eventDtoService.getByName(name);
    }

    @PostMapping()
    public EventSaveDto save(@RequestBody EventSaveDto eventSaveDto){
        return eventDtoService.save(eventSaveDto);
    }
    @GetMapping("/{id}/availability")
    public ResponseEntity<Integer> getEventAvailability(@PathVariable("id") int eventId) {
        int availability = eventDtoService.calculateTotalAvailableTickets(eventId);
        if (availability >= 0) {
            return ResponseEntity.ok(availability);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
