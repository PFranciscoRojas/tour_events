package com.tour.events.domain.repository;

import com.tour.events.domain.dto.EventDto;
import com.tour.events.domain.dto.EventSaveDto;

import java.util.List;
import java.util.Optional;

public interface EventDtoRepository {
    List<EventDto> getAll();
//    List<EventDto> getByCity();

    List<EventDto> getByCity(String eventDtoCity);
    List<EventDto> getByName(String eventDtoName);

    Optional<EventDto> getById(Integer idEventDto);
//    EventDto save(EventDto eventDto);
    EventSaveDto save(EventSaveDto eventSaveDto);
}
