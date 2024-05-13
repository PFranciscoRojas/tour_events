package com.tour.events.domain.service;

import com.tour.events.domain.dto.EventDto;
import com.tour.events.domain.dto.EventSaveDto;
import com.tour.events.domain.repository.EventDtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventDtoService {

    private final EventDtoRepository eventRepo;

    @Autowired
    public EventDtoService(EventDtoRepository eventRepo) {
        this.eventRepo = eventRepo;
    }

    public List<EventDto> getAll() {
        return eventRepo.getAll();
    }

    public List<EventDto> getByCity(String eventDtoCity) {
        return eventRepo.getByCity(eventDtoCity);
    }

    public List<EventDto> getByName(String eventDtoName) {
        return eventRepo.getByName(eventDtoName);
    }

    public Optional<EventDto> getByID(int eventDtoID) {
        return eventRepo.getById(eventDtoID);
    }

    public EventSaveDto save(EventSaveDto eventSaveDto) {
        return eventRepo.save(eventSaveDto);
    }

    public int calculateTotalAvailableTickets(int eventId) {
        Optional<EventDto> optionalEvent = eventRepo.getById(eventId);
        return optionalEvent.map(EventDto::getTotalAvailableTickets).orElse(-1);
    }

    public EventDto update(int eventId, EventSaveDto eventSaveDto) {
        return eventRepo.getById(eventId)
                .map(existingEvent -> {
                    existingEvent.setNameDto(eventSaveDto.getNameDto());
                    existingEvent.setLocationDto(eventSaveDto.getLocationDto());
                    return eventRepo.save(existingEvent);
                })
                .orElse(null);
    }
}
