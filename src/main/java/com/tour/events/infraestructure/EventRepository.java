package com.tour.events.infraestructure;

import com.tour.events.domain.dto.EventDto;
import com.tour.events.domain.dto.EventSaveDto;
import com.tour.events.domain.repository.EventDtoRepository;
import com.tour.events.infraestructure.entities.Event;
import com.tour.events.infraestructure.mapper.EventMapper;
import com.tour.events.infraestructure.mapper.EventSaveMapper;
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

    @Autowired
    public EventSaveMapper eventSaveMapper;

    @Override
    public List<EventDto> getAll() {
        List<Event> events = (List<Event>) eventRepo.findAll();
        return eventMapper.toEventsDto(events);
    }

    @Override
    public List<EventDto> getByCity(String eventDtoCity) {
        List<Event> eventsCity = (List<Event>) eventRepo.findByCity(eventDtoCity);
        return eventMapper.toEventsDto(eventsCity);
    }

    @Override
    public List<EventDto> getByName(String eventDtoName) {
        List<Event> eventName = (List<Event>) eventRepo.findByName(eventDtoName);
        return eventMapper.toEventsDto(eventName);
    }

    @Override
    public Optional<EventDto> getById(Integer idEventDto) {
        Optional<Event> event = eventRepo.findById( idEventDto);
        return eventMapper.toEventsDtoOptional(event);
    }

    @Override
    public EventSaveDto save(EventSaveDto eventSaveDto) {
        Event event = eventSaveMapper.toEvent(eventSaveDto);
        return eventSaveMapper.toEventSaveDto(eventRepo.save(event));
    }
}
