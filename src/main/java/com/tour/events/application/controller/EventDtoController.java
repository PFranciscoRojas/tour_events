package com.tour.events.application.controller;

import com.tour.events.domain.service.EventDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class EventDtoController {
    @Autowired
    private EventDtoService eventDtoService;

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
