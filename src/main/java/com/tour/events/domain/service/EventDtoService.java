package com.tour.events.domain.service;

import com.tour.events.domain.dto.EventDto;
import com.tour.events.domain.repository.EventDtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventDtoService {
    @Autowired
    private EventDtoRepository eventRepo;

    public int calculateTotalAvailableTickets(int eventId) {
        Optional<EventDto> optionalEvent = eventRepo.getById(eventId);
        if (optionalEvent.isPresent()) {
            EventDto event = optionalEvent.get();
            return event.getTotalAvailableTickets();
        } else {
            return -1; // Manejo de caso en el que el evento no existe
        }
    }
}
