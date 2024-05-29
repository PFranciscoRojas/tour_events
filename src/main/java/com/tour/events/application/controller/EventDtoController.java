package com.tour.events.application.controller;

import com.tour.events.domain.dto.EventDto;
import com.tour.events.domain.dto.EventSaveDto;
import com.tour.events.domain.service.EventDtoService;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    public ResponseEntity<?> save(@Validated @RequestBody EventSaveDto eventSaveDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            bindingResult.getFieldErrors().forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
            return ResponseEntity.badRequest().body(errors);
        }
        return ResponseEntity.ok(eventDtoService.save(eventSaveDto));
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

    @PutMapping("/{id}")
    public ResponseEntity<EventSaveDto> updateEvent(@PathVariable int id, @RequestBody EventSaveDto eventSaveDto) {
        try {
            eventSaveDto.setIdDto(id);  // Ensure the DTO has the correct ID
            EventSaveDto updatedEvent = eventDtoService.updateEvent(eventSaveDto);
            return ResponseEntity.ok(updatedEvent);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
