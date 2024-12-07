package com.tour.events.domain.service;

import com.tour.events.domain.dto.EventDto;
import com.tour.events.domain.dto.EventSaveDto;
import com.tour.events.domain.repository.EventDtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class EventDtoService {
    @Autowired
    private EventDtoRepository eventRepo;

    public List<EventDto> getAll(){
        return eventRepo.getAll();
    }
    public List<EventDto> getByCity(String eventDtoCity){
        List<EventDto> events = eventRepo.getByCity(eventDtoCity);
        return eventRepo.getByCity(eventDtoCity);
    }

    public List<EventDto> getByName(String eventDtoName){
        List<EventDto> events = eventRepo.getByName(eventDtoName);
        return eventRepo.getByName(eventDtoName);
    }

    public Optional<EventDto> getByID(int eventDtoID){
        return eventRepo.getById(eventDtoID);
    }

//    public EventDto save(EventDto eventDto){
//        return eventRepo.save(eventDto);
//    }
    public EventSaveDto save(EventSaveDto eventSaveDto){
        return eventRepo.save(eventSaveDto);
    }

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
