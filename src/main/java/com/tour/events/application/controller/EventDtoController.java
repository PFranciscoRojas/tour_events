package com.tour.events.application.controller;

import com.tour.events.domain.dto.EventDto;
import com.tour.events.domain.dto.EventSaveDto;
import com.tour.events.domain.service.EventDtoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/events")
public class EventDtoController {
    private final EventDtoService eventDtoService;

    public EventDtoController(EventDtoService eventDtoService) {
        this.eventDtoService = eventDtoService;
    }

    @GetMapping
    public List<EventDto> getAll() {
        return eventDtoService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventDto> getByID(@PathVariable int id) {
        Optional<EventDto> eventDto = eventDtoService.getByID(id);
        return eventDto.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/city")
    public List<EventDto> getByCity(@RequestParam String city) {
        return eventDtoService.getByCity(city);
    }

    @GetMapping("/name")
    public List<EventDto> getByName(@RequestParam String name) {
        return eventDtoService.getByName(name);
    }

    @PostMapping
    public EventSaveDto save(@RequestBody EventSaveDto eventSaveDto) {
        return eventDtoService.save(eventSaveDto);
    }

    @GetMapping("/{id}/availability")
    public ResponseEntity<Integer> getEventAvailability(@PathVariable int id) {
        int availability = eventDtoService.calculateTotalAvailableTickets(id);
        return ResponseEntity.ok(availability);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EventDto> updateEvent(@PathVariable int id, @RequestBody EventSaveDto eventSaveDto) {
        EventDto updatedEvent = eventDtoService.update(id, eventSaveDto);
        return updatedEvent != null ? ResponseEntity.ok(updatedEvent) : ResponseEntity.notFound().build();
    }
}
