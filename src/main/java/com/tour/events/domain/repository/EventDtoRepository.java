package com.tour.events.domain.repository;

import com.tour.events.domain.dto.EventDto;

import java.util.List;
import java.util.Optional;

public interface EventDtoRepository {
    List<EventDto> getAll();
    Optional<EventDto> getById(Integer idEventDto);
    EventDto save(EventDto ticketDto);
}
