package com.tour.events.domain.service;

import com.tour.events.domain.dto.EventDto;
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

    public Optional<EventDto> getByID(int eventDtoID){
        return eventRepo.getById(eventDtoID);
    }

    public EventDto save(EventDto eventDto){
        return eventRepo.save(eventDto);
    }
}
