package com.tour.events.infraestructure;

import com.tour.events.domain.dto.EventDto;
import com.tour.events.domain.repository.EventDtoRepository;
import com.tour.events.infraestructure.entities.Event;
import com.tour.events.infraestructure.mapper.EventMapper;
import com.tour.events.infraestructure.repositories.EventCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EventRepository implements EventDtoRepository {

    @Autowired
    public EventCrudRepository eventRepo;

    @Autowired
    public EventMapper eventMapper;

    @Override
    public List<EventDto> getAll() {
        List<Event> events = (List<Event>) eventRepo.findAll();
        return eventMapper.toEventsDto(events);
    }

    @Override
    public Optional<EventDto> getById(Integer idEventDto) {
        Optional<Event> event = eventRepo.findById( idEventDto);
        return eventMapper.toEventsDtoOptional(event);
    }

    @Override
    public EventDto save(EventDto eventDto) {
        Event event = eventMapper.toEvent(eventDto);
        return eventMapper.toEventDto(eventRepo.save(event));
    }
}
