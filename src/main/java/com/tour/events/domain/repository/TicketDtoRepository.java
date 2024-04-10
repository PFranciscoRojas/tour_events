package com.tour.events.domain.repository;

import java.util.List;
import java.util.Optional;

import com.tour.events.domain.dto.TicketDto;

public interface TicketDtoRepository {
    List<TicketDto> getAll();
    Optional<TicketDto> getById(Integer idTicketDto);

    TicketDto save(TicketDto ticketDto);
}
